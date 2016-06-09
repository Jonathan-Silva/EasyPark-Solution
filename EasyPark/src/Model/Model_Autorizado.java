package Model;

import Controller.Ctrl_Autorizado;
import Controller.Ctrl_Util;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Model_Autorizado{
    private static ResultSet rs = null;
    private static  String sqlString ="";
    public static void Atualizar()
    {
        
    }
    
    public static String Salvar(Ctrl_Autorizado Autoriazado) throws SQLException 
    {
            
        Ctrl_Autorizado Pessoa = new Ctrl_Autorizado();
        Pessoa.setCpf(Autoriazado.getCpf());
        Pessoa.setCelular(Autoriazado.getCelular());
        Pessoa.setFixo(Autoriazado.getFixo());
        Pessoa.setNome(Autoriazado.getNome());
        Pessoa.setEmail(Autoriazado.getEmail());
        Pessoa.setCep(Autoriazado.getCep());
        Pessoa.setNumero(Autoriazado.getNumero());
        Pessoa.setTipo(Autoriazado.getTipo());
        
        Autoriazado.setIdPessoa(Model_Pessoa.Salvar(Pessoa,"PESSOA"));
      
        
        sqlString = "insert into AUTORIZADO (CNH, ID_PESSOA) values ('" 
                +Autoriazado.getCnh()+ "','"
                +Autoriazado.getIdPessoa()+"')";
        
        boolean r = Model_Banco.Salvar(sqlString);
        
        String CodAtual = null;
        if (r==true) 
        {
            r = false;
            //INSERT INTO CLIENTE_AUTO(ID, ID_AUTORIZADO, ID_CLIENTE) VALUES  (,)
            sqlString = "INSERT INTO CLIENTE_AUTO(ID_AUTORIZADO, ID_CLIENTE) VALUES("
                    +Autoriazado.getId()+ ","
                    +Ctrl_Util.IdCliente +")";
            r = Model_Banco.Salvar(sqlString);
            if (r==true) {
                
                CodAtual = Model_Banco.BuscaCodigoNovo("AUTORIZADO");
            }
            
        }
        
        return CodAtual;
        
    }
    
    public static Boolean Deletar(String Cod)
    {
       
        sqlString = "delete from CLIENTE * where (ID= "+ Cod +")";
               
        
        return true;
    }    
    
    public static Ctrl_Autorizado  BuscaAutorizado(String Id_Pessoa, String Cnh )
    {
        Ctrl_Autorizado Autorizado = new Ctrl_Autorizado();
        try 
        {
           sqlString ="SELECT * FROM PESSOA WHERE (ID="+Id_Pessoa+")";
           rs = Model_Banco.BuscaRegistro(sqlString);
           if (rs.next()) {   
                Autorizado.setId(rs.getString(1));
                Autorizado.setCpf(rs.getString(2));
                Autorizado.setNome(rs.getString(3));
                Autorizado.setFixo(rs.getString(4));
                Autorizado.setCelular(rs.getString(5));
                Autorizado.setEmail(rs.getString(6));
                Autorizado.setNumero(rs.getString(7));
                Autorizado.setCep(rs.getString(8));
                Autorizado.setCnh(Cnh);
           }
           
           
        } 
        catch (Exception e)
        {
            
        }
        
        
        return Autorizado;
    }
    
     public static List<Ctrl_Autorizado> Busca(String Id_Cliente)
    {

        List<String> ListaIdAutorizado = new ArrayList<String>();
        List<String> ListaIdPessoa = new ArrayList<String>();
        List<Ctrl_Autorizado> ListaAutorizado = new ArrayList<Ctrl_Autorizado>();
        try 
        {
            sqlString ="SELECT ID_AUTORIZADO FROM CLIENTE_AUTO WHERE (ID_CLIENTE ="+Id_Cliente+")";
            rs = Model_Banco.BuscaRegistro(sqlString);
            while (rs.next()) {
               String x = rs.getString(1);
               ListaIdAutorizado.add(x);  
            }
           
            for (int i = 0; i < ListaIdAutorizado.size(); i++) {
                sqlString ="SELECT ID_PESSOA FROM AUTORIZADO WHERE (ID="+ListaIdAutorizado.get(i)+")";
                rs = Model_Banco.BuscaRegistro(sqlString);
                if (rs.next()) {
                   String x = rs.getString(1);
                   ListaIdPessoa.add(x);                     
                }
            }
            
            for (int i = 0; i < ListaIdPessoa.size(); i++) {
                sqlString ="SELECT * FROM PESSOA WHERE (ID="+ListaIdPessoa.get(i)+")";
                rs = Model_Banco.BuscaRegistro(sqlString);
                
                Ctrl_Autorizado Autorizado = new Ctrl_Autorizado();
                
                if (rs.next()) {
                    Autorizado.setId(rs.getString(1));
                    Autorizado.setCpf(rs.getString(2));
                    Autorizado.setNome(rs.getString(3));
                    Autorizado.setFixo(rs.getString(4));
                    Autorizado.setCelular(rs.getString(5));
                    Autorizado.setEmail(rs.getString(6));
                    Autorizado.setNumero(rs.getString(7));
                    Autorizado.setCep(rs.getString(8));
                    Autorizado.setIdAutorizado(ListaIdAutorizado.get(i).toString());
                    
                    ListaAutorizado.add(Autorizado);
                }
            }
           
           
        } 
        catch (Exception e)
        {
             return null;
        }
        
        
        return ListaAutorizado;
    }
       
}
