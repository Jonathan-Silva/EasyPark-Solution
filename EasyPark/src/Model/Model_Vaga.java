
package Model;

import Controller.Ctrl_Vaga;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Model_Vaga {
     public static String sqlString=""; 
    public static Boolean Atualizar()
    {
        try 
        {
            
        } 
        catch (Exception e) 
        {
            return false;
        }
        return true;
    }
    
    public static String Salvar(Ctrl_Vaga Vaga, String Tabela) throws SQLException 
    {
        
        
        
        Vaga.setIdTipo(Vaga.getIdTipo().equals("CARRO")? "1" : "2");
        Vaga.setStatus("0");
        sqlString ="INSERT INTO VAGA(ID_TIPO, PRECO, LOCALIZACAO, STATUS, DESCRICAO) VALUES("
                +Vaga.getIdTipo()+","
                +Vaga.getPreco()+",'"
                +Vaga.getLocalizacao()+"',"
                +Vaga.getStatus()+",'"
                +Vaga.getDescricao()+"')";
        
        boolean r = Model_Banco.Salvar(sqlString);
        String  CodAtualVaga=null;
        if(r==true)
        {
          CodAtualVaga =  Model_Banco.BuscaCodigoNovo(Tabela);    
        }
        
        return CodAtualVaga;
    }
    
    public static Boolean Deletar(String Cod) throws SQLException
    {
        sqlString = "delete from PESSOA where (ID="+Cod+")";
        return Model_Banco.Deletar(sqlString);
    }    
    
    public static java.util.List<Ctrl_Vaga>  BuscarVagas(){
    
        ArrayList<Ctrl_Vaga> Vagas = new ArrayList<Ctrl_Vaga>();
        ResultSet rs = null;
       
        Ctrl_Vaga nhs = new Ctrl_Vaga();
        
        String sqlString ="SELECT LOCALIZACAO, STATUS FROM VAGA";
        try 
        {
            rs = Model_Banco.BuscaRegistro(sqlString);
            while (rs.next()) 
            {
                Ctrl_Vaga Vaga = new Ctrl_Vaga();
                Vaga.setLocalizacao(rs.getString(1));
                Vaga.setStatus(rs.getString(2));
                Vagas.add(Vaga);
            }
        } 
        catch (Exception e) 
        {
            return null;
        }
        return Vagas;
    }
}
