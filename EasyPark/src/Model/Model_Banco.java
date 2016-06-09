package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Model_Banco {

private static  Connection conexao = null;   

public static void Open(){

    try 
       {
        // Carrega o driver JDBC 
        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; //  JDBC driver
        Class.forName(driverName); // Create a conexao  com Banco de dados 
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=EASYPARK;";
        String user ="sa";
        String key ="123456";
        conexao = DriverManager.getConnection(connectionUrl, user, key);

      
   
       } 
    catch (ClassNotFoundException e) 
       {
         JOptionPane.showMessageDialog(null, "Erro ao carregar o drive.");
       } 
    catch (SQLException e) 
       { 
         JOptionPane.showMessageDialog(null, "Erro de sql" + e);
         
     }
        
    }
 public static String BuscaCodigoNovo(String Tabela) throws SQLException
    {
        ResultSet rs = null;
        long cod =0;
        Statement statement = conexao.createStatement();
        String sqlstring = "select ID from " + Tabela + " order by ID desc";
     
        
        rs = statement.executeQuery(sqlstring);
       
        if (rs.next()) {
            cod = rs.getLong(1);
        }

        return String.valueOf(++cod);
    }

      public static String BuscaCodigo(String Tabela) throws SQLException
    {
        ResultSet rs = null;
        long cod =0;
        Statement statement = conexao.createStatement();
        String sqlstring = "select ID from " + Tabela + " order by ID desc";
     
        
        rs = statement.executeQuery(sqlstring);
       
        if (rs.next()) {
            cod = rs.getLong(1);
        }

        return String.valueOf(cod);
    }
    
    public static Boolean Salvar (String sqlString) throws SQLException
    {
       
        Statement statement = conexao.createStatement();
        try 
            {
                statement.executeUpdate(sqlString);
                return true;
            } 
        catch (Exception e) 
            {
                return false;
            }
    }
    
    public static Boolean Deletar(String sqlString) throws SQLException
    {
      
        Statement statement = conexao.createStatement();
        try 
            {
              statement.executeUpdate(sqlString);
            }
        catch (Exception e)
            {
                return false;
            }
        return  true;
    }
    
    public static ResultSet BuscaRegistro(String sqlString) throws SQLException
    {
           Statement statement = conexao.createStatement();
           ResultSet rs = null;
        try 
        {         
           rs = statement.executeQuery(sqlString);
          
        } 
        catch (Exception e) 
        {
           
        }
        return rs;
    }

}
    

