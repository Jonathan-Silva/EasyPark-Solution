
package Model;
import Controller.Ctrl_Endereco;
import java.sql.ResultSet;
public class Model_Endereco {
    
    private static Ctrl_Endereco Endereco = new Ctrl_Endereco();
    
    public static Ctrl_Endereco BuscarEndereco(String CEP)
    {
         ResultSet rs = null;
        String sqlString ="select * from ENDERECO where (CEP=" + CEP + ")";
        try 
        {
            Endereco.setLogradouro(null); 
            rs = Model_Banco.BuscaRegistro(sqlString);
            if (Endereco.getLogradouro()!=null)
            {
                if (rs.next()) 
                    {
                        Endereco.setCep(rs.getString(2));
                        Endereco.setUf(rs.getString(3));
                        Endereco.setCidade(rs.getString(4));
                        Endereco.setLogradouro(rs.getNString(5));
                    }
            }
            return Endereco;
        } 
        catch (Exception e) 
        {
            return null;
        }
    
    
    }
}
