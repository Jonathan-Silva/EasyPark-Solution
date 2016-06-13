
package Model;

import Controller.Ctrl_Cliente;
import Controller.Ctrl_Venda;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Model_Venda {
    
    private static ResultSet rs = null;
    private static String sqlString;
    
    public static Boolean Salvar(Ctrl_Venda Venda) throws SQLException 
    {
        boolean r = false;
        try 
        {
           sqlString = "INSERT INTO  VENDA(DHORA_INICIAL, ID_VAGA, ID_MOTORISTA, "
                    + "ID_VEICULO, STATUS) VALUES ('" 
                    + Venda.getDhora_Inicial() +"',"
                    + Venda.getId_Vaga()+","
                    + Venda.getId_Motorista()+","
                    + Venda.getId_Veiculo()+", 1)";
      
            r = Model_Banco.Salvar(sqlString); 
            
            if (r==true) {
                
                Model_Vaga.SetStatusVaga(Venda.getId_Vaga(), "1");
            }
        
        } 
        catch (Exception e) 
        {
          return r;
        }
     
        
        return r;
        
    }
    
   public static List<Ctrl_Venda> Busca(String Key, int Tipo)
    {
        List<Ctrl_Venda> ListaVenda = new ArrayList<Ctrl_Venda>();
        try 
        {
            if (Tipo == 0) {
                sqlString = "SELECT * FROM VENDA WHERE (ID LIKE " + Key +")";
            }
            else{
                sqlString = "SELECT * FROM VENDA WHERE (ID_Motorista LIKE " + Key +")";
            }
            rs = Model_Banco.BuscaRegistro(sqlString);
            while (rs.next())
            {    
                Ctrl_Venda Venda = new Ctrl_Venda();
                Venda.setId(rs.getString(1));
                Venda.setDhora_Inicial(rs.getString(2));
                Venda.setDhora_Final(rs.getString(3));
                Venda.setId_Vaga(rs.getString(4));
                Venda.setId_Motorista(rs.getString(5));
                Venda.setId_Veiculo(rs.getString(6));
                Venda.setStatus(rs.getString(7));
                Venda.setPreco(rs.getString(8));
                
                ListaVenda.add(Venda);         
            }
        } 
        catch (Exception e)
        {
             return null;
        }
        
        
        return ListaVenda;
    }
    
   public static void SetStatusVenda(String IdVaga, String Status) throws SQLException{
       
        sqlString = "UPDATE VENDA SET STATUS = "+ Status +" WHERE (ID ="+ IdVaga +")"; 
        boolean r = Model_Banco.Salvar(sqlString);
        
    }
}
