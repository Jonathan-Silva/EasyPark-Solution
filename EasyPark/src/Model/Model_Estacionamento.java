
package Model;

import Controller.Ctrl_Cliente;
import Controller.Ctrl_Estacionamento;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model_Estacionamento {
    
    //ID, CNPJ, NOME, TELEFONE, TELEFONE2, CELULAR, NUMERO, CEP
    
    private static ResultSet rs = null;
    public static void Atualizar()
    {
        
    }
    
    public static String Salvar(Ctrl_Estacionamento Estacionamento) throws SQLException  
    {   
        String  sqlString = "insert into ESTACIONAMENTO(CNPJ, NOME, TELEFONE, TELEFONE2, CELULAR, NUMERO, CEP) VALUES ('"
               + Estacionamento.getCnpj()  + "','" 
               + Estacionamento.getNome()  + "','" 
               + Estacionamento.getTelefone() + "','" 
               + Estacionamento.getTelefone() + "','" 
               + Estacionamento.getCelular()+ "','"
               + Estacionamento.getNumero()+ "','" 
               + Estacionamento.getCep() + "'" ; 
               

        
        boolean r = Model_Banco.Salvar(sqlString);
        String IdAtual = "01";
 
        
        return IdAtual;
        
    }
    
    public static Boolean Deletar(String Cod)
    {
       
       String sqlString = "delete from CLIENTE * where (ID= "+ Cod +")";
               
        
        return true;
    }    
    
    public static Ctrl_Cliente  BuscaCliente(String Id_Pessoa, String Cnh )
    {
        Ctrl_Cliente Cliente = new Ctrl_Cliente();
        try 
        {
           String sqlString ="SELECT * FROM PESSOA WHERE (ID="+Id_Pessoa+")";
           rs = Model_Banco.BuscaRegistro(sqlString);
           if (rs.next()) {   
                Cliente.setId(rs.getString(1));
                Cliente.setCpf(rs.getString(2));
                Cliente.setNome(rs.getString(3));
                Cliente.setFixo(rs.getString(4));
                Cliente.setCelular(rs.getString(5));
                Cliente.setEmail(rs.getString(6));
                Cliente.setNumero(rs.getString(7));
                Cliente.setCep(rs.getString(8));
                Cliente.setCnh(Cnh);
           }
           
           
        } 
        catch (Exception e)
        {
            
        }
        
        
        return Cliente;
    }
  
}
