
package Model;

import Controller.Ctrl_Cliente;
import Controller.Ctrl_Funcionario;
import Controller.Ctrl_Pessoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Model_Funcionario {   

    private static ResultSet rs = null;
    private static String sqlString;
    public static void Atualizar()
    {
        
    }
    
    public static String Salvar(Ctrl_Funcionario Funcionario) throws SQLException 
    {
            
        Ctrl_Pessoa Pessoa = new Ctrl_Pessoa();
        Pessoa.setCpf(Funcionario.getCpf());
        Pessoa.setCelular(Funcionario.getCelular());
        Pessoa.setFixo(Funcionario.getFixo());
        Pessoa.setNome(Funcionario.getNome());
        Pessoa.setEmail(Funcionario.getEmail());
        Pessoa.setCep(Funcionario.getCep());
        Pessoa.setNumero(Funcionario.getNumero());
        Pessoa.setTipo(Funcionario.getTipo());
        
        Funcionario.setIdPessoa(Model_Pessoa.Salvar(Pessoa,"PESSOA"));
      
        
        sqlString = "insert into FUNCIONARIO (Login, ID_PESSOA) values ('" 
                +Funcionario.getLogin()+ "','"
                +Funcionario.getIdPessoa()+"')";
        
        boolean r = Model_Banco.Salvar(sqlString);
        String CodAtualFuncionario = null;
        if (r==true) 
        {
            CodAtualFuncionario = Model_Banco.BuscaCodigoNovo("FUNCIONARIO");
        }
        
        return CodAtualFuncionario;
        
    }
    
    public static Boolean Deletar(String Id)
    {
       
        sqlString = "delete from FUNCIONARIO * where (ID= "+ Id +")";
               
        
        return true;
    }    
    
    public static Ctrl_Funcionario  BuscaFuncionario(String Id_Pessoa, String Cnh )
    {
        Ctrl_Funcionario Funcionario = new Ctrl_Funcionario();
        try 
        {
           sqlString ="SELECT * FROM PESSOA WHERE (ID="+Id_Pessoa+")";
           rs = Model_Banco.BuscaRegistro(sqlString);
           if (rs.next()) {   
                Funcionario.setId(rs.getString(1));
                Funcionario.setCpf(rs.getString(2));
                Funcionario.setNome(rs.getString(3));
                Funcionario.setFixo(rs.getString(4));
                Funcionario.setCelular(rs.getString(5));
                Funcionario.setEmail(rs.getString(6));
                Funcionario.setNumero(rs.getString(7));
                Funcionario.setCep(rs.getString(8));
               
           }
           
           
        } 
        catch (Exception e)
        {
            
        }
        
        
        return Funcionario;
    }
  public static List<Ctrl_Funcionario> Busca(String Key, int Tipo)
    {
        List<String> ListaIdFuncionario = new ArrayList<String>();
        List<String> ListaIdPessoa = new ArrayList<String>();
        List<Ctrl_Funcionario> ListaFuncionario = new ArrayList<Ctrl_Funcionario>();
        try 
        {
            if (Tipo == 0) {
                sqlString ="SELECT ID_PESSOA FROM FUNCIONARIO WHERE (ID = "+Key+")";
                rs = Model_Banco.BuscaRegistro(sqlString);
                if(rs.next()) {
                    String x = rs.getString(1);
                    ListaIdPessoa.add(x);  
                }

                for (int i = 0; i < ListaIdPessoa.size(); i++) {
                    sqlString ="SELECT * FROM PESSOA WHERE (ID="+ListaIdPessoa.get(i)+")";
                    rs = Model_Banco.BuscaRegistro(sqlString);

                    Ctrl_Funcionario Funcionario = new Ctrl_Funcionario();

                    if (rs.next()) {
                        Funcionario.setId(rs.getString(1));
                        Funcionario.setCpf(rs.getString(2));
                        Funcionario.setNome(rs.getString(3));
                        Funcionario.setFixo(rs.getString(4));
                        Funcionario.setCelular(rs.getString(5));
                        Funcionario.setEmail(rs.getString(6));
                        Funcionario.setNumero(rs.getString(7));
                        Funcionario.setCep(rs.getString(8));

                        Funcionario.setIdFuncionario(Key);

                        ListaFuncionario.add(Funcionario);
                    }
                }     
            }
            
            if (Tipo==1) {
                sqlString ="SELECT * FROM PESSOA WHERE (TIPO = 'F') AND (NOME LIKE '"+Key+"%')";
                rs = Model_Banco.BuscaRegistro(sqlString);
                
                while(rs.next()){
                    Ctrl_Funcionario Funcionario = new Ctrl_Funcionario();

                    Funcionario.setId(rs.getString(1));
                    Funcionario.setCpf(rs.getString(2));
                    Funcionario.setNome(rs.getString(3));
                    Funcionario.setFixo(rs.getString(4));
                    Funcionario.setCelular(rs.getString(5));
                    Funcionario.setEmail(rs.getString(6));
                    Funcionario.setNumero(rs.getString(7));
                    Funcionario.setCep(rs.getString(8));

                    ListaFuncionario.add(Funcionario);
                    
                }

                for (int i = 0; i < ListaFuncionario.size(); i++) {
                    sqlString ="SELECT ID FROM FUNCIONARIO WHERE (ID_PESSOA="+ListaFuncionario.get(i).getId()+")";
                    rs = Model_Banco.BuscaRegistro(sqlString);
                    while (rs.next()) {
                        ListaFuncionario.get(i).setIdFuncionario(rs.getString(1));                        
                    }                 
                }                                  
            }
      
        } 
        catch (Exception e)
        {
             return null;
        }
        
        
        return ListaFuncionario;
    }
    
}

