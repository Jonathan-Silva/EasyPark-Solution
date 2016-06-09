
package Model;

import Controller.Ctrl_Autorizado;
import Controller.Ctrl_Util;
import Controller.Ctrl_Veiculo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Model_Veiculo {
    private static ResultSet rs = null;
    private static  String sqlString ="";
    public static void Atualizar()
    {
        
    }
    
    public static String Salvar(Ctrl_Veiculo Veiculo) throws SQLException 
    {
 
        sqlString = "insert into VEICULO (PLACA, ID_TIPO_VAGA, ID_MOTORISTA) values ('" 
                +Veiculo.getPlaca()+ "',"
                +Veiculo.getIdTipoVaga()+ ","
                +Veiculo.getIdMotorista()+")";
        
        boolean r = Model_Banco.Salvar(sqlString);
        
        String CodAtual = null;
        if (r==true) 
        {
          CodAtual = Model_Banco.BuscaCodigoNovo("AUTORIZADO");     
        }
        
        return CodAtual;
        
    }
    
    public static Boolean Deletar(String Cod)
    {
       
        sqlString = "delete from VEICULO * where (ID= "+ Cod +")";
               
        
        return true;
    }    
    
    public static Ctrl_Veiculo  BuscaVeiculo(String Placa)
    {
        Ctrl_Veiculo Veiculo = new Ctrl_Veiculo();
        try 
        {
           sqlString ="SELECT * FROM VEICULO WHERE (PLACA='"+Placa+"')";
           rs = Model_Banco.BuscaRegistro(sqlString);
           if (rs.next()) {   
                Veiculo.setId(rs.getString(1));
                Veiculo.setPlaca(rs.getString(2));
                Veiculo.setIdTipoVaga(rs.getString(3));
                Veiculo.setIdMotorista(rs.getString(4));              
           }
           
           
        } 
        catch (Exception e)
        {
            
        }
        
        
        return Veiculo;
    }
    
    public static List<Ctrl_Veiculo> Busca(String Id_Cliente)
    {


        List<Ctrl_Veiculo> ListaVeiculo = new ArrayList<Ctrl_Veiculo>();
        try 
        {
            sqlString ="SELECT * FROM VEICULO WHERE (ID_MOTORISTA ="+Id_Cliente+")";
            rs = Model_Banco.BuscaRegistro(sqlString);
            while (rs.next()) {
                    Ctrl_Veiculo Veiculo = new Ctrl_Veiculo();
                    Veiculo.setId(rs.getString(1));
                    Veiculo.setPlaca(rs.getString(2));
                    Veiculo.setIdTipoVaga(rs.getString(3));
                    Veiculo.setIdMotorista(rs.getString(4));
                    
                    ListaVeiculo.add(Veiculo);
                }
            
           
           
        } 
        catch (Exception e)
        {
             return null;
        }
        
        
        return ListaVeiculo;
    }
       
    
     
}
