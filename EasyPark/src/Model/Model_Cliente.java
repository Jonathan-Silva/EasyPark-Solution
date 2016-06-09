
package Model;

import Controller.Ctrl_Autorizado;
import Controller.Ctrl_Cliente;
import Controller.Ctrl_Pessoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Model_Cliente {   

    private static ResultSet rs = null;
    private static String sqlString;
    public static void Atualizar()
    {
        
    }
    
    public static String Salvar(Ctrl_Cliente Cliente) throws SQLException 
    {
            
        Ctrl_Pessoa Pessoa = new Ctrl_Pessoa();
        Pessoa.setCpf(Cliente.getCpf());
        Pessoa.setCelular(Cliente.getCelular());
        Pessoa.setFixo(Cliente.getFixo());
        Pessoa.setNome(Cliente.getNome());
        Pessoa.setEmail(Cliente.getEmail());
        Pessoa.setCep(Cliente.getCep());
        Pessoa.setNumero(Cliente.getNumero());
        Pessoa.setTipo(Cliente.getTipo());
        
        Cliente.setIdPessoa(Model_Pessoa.Salvar(Pessoa,"PESSOA"));
      
        
        sqlString = "insert into CLIENTE (CNH, ID_PESSOA) values ('" 
                +Cliente.getCnh()+ "','"
                +Cliente.getIdPessoa()+"')";
        
        boolean r = Model_Banco.Salvar(sqlString);
        String CodAtualCliente = null;
        if (r==true) 
        {
            CodAtualCliente = Model_Banco.BuscaCodigoNovo("CLIENTE");
        }
        
        return CodAtualCliente;
        
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
           sqlString ="SELECT * FROM PESSOA WHERE (ID="+Id_Pessoa+")";
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
    
     public static Ctrl_Cliente  BuscaCnh(String Id_Pessoa)
    {
        Ctrl_Cliente Cliente = new Ctrl_Cliente();

        try 
        {
           sqlString ="SELECT CNH,ID FROM CLIENTE WHERE (ID_PESSOA="+Id_Pessoa+")";
           rs = Model_Banco.BuscaRegistro(sqlString);
           if (rs.next()) {   
                Cliente.setCnh(rs.getString(1));
                Cliente.setId(rs.getString(2));
    
           }
           
           
        } 
        catch (Exception e)
        {
             Cliente.setId("false");
             return Cliente;
        }
        
        
        return Cliente;
    }
    
      public static List<Ctrl_Cliente> Busca(String Key, int Tipo)
    {
        List<String> ListaIdCliente = new ArrayList<String>();
        List<String> ListaIdPessoa = new ArrayList<String>();
        List<Ctrl_Cliente> ListaCliente = new ArrayList<Ctrl_Cliente>();
        try 
        {
            if (Tipo == 0) {
                sqlString ="SELECT ID_PESSOA FROM CLIENTE WHERE (ID = "+Key+")";
                rs = Model_Banco.BuscaRegistro(sqlString);
                if(rs.next()) {
                    String x = rs.getString(1);
                    ListaIdPessoa.add(x);  
                }

                for (int i = 0; i < ListaIdPessoa.size(); i++) {
                    sqlString ="SELECT * FROM PESSOA WHERE (ID="+ListaIdPessoa.get(i)+")";
                    rs = Model_Banco.BuscaRegistro(sqlString);

                    Ctrl_Cliente Cliente = new Ctrl_Cliente();

                    if (rs.next()) {
                        Cliente.setId(rs.getString(1));
                        Cliente.setCpf(rs.getString(2));
                        Cliente.setNome(rs.getString(3));
                        Cliente.setFixo(rs.getString(4));
                        Cliente.setCelular(rs.getString(5));
                        Cliente.setEmail(rs.getString(6));
                        Cliente.setNumero(rs.getString(7));
                        Cliente.setCep(rs.getString(8));

                        Cliente.setIdCliente(Key);

                        ListaCliente.add(Cliente);
                    }
                }     
            }
            
            if (Tipo==1) {
                sqlString ="SELECT * FROM PESSOA WHERE (TIPO = 'C') AND (NOME LIKE '"+Key+"%')";
                rs = Model_Banco.BuscaRegistro(sqlString);
                
                while(rs.next()){
                    Ctrl_Cliente Cliente = new Ctrl_Cliente();

                    Cliente.setId(rs.getString(1));
                    Cliente.setCpf(rs.getString(2));
                    Cliente.setNome(rs.getString(3));
                    Cliente.setFixo(rs.getString(4));
                    Cliente.setCelular(rs.getString(5));
                    Cliente.setEmail(rs.getString(6));
                    Cliente.setNumero(rs.getString(7));
                    Cliente.setCep(rs.getString(8));

                    ListaCliente.add(Cliente);
                    
                }

                for (int i = 0; i < ListaCliente.size(); i++) {
                    sqlString ="SELECT ID FROM CLIENTE WHERE (ID_PESSOA="+ListaCliente.get(i).getId()+")";
                    rs = Model_Banco.BuscaRegistro(sqlString);
                    while (rs.next()) {
                        ListaCliente.get(i).setIdCliente(rs.getString(1));                        
                    }                 
                }                                  
            }
      
        } 
        catch (Exception e)
        {
             return null;
        }
        
        
        return ListaCliente;
    }
    
}
