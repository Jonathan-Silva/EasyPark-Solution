
package Model;

import Controller.Ctrl_Pessoa;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model_Pessoa {   

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
    
    public static String Salvar(Ctrl_Pessoa Pessoa, String Tabela) throws SQLException 
    {
        
        sqlString ="INSERT INTO PESSOA"+
                "(CPF, NOME, TELEFONE, CELULAR, EMAIL, NUMERO, CEP, TIPO) VALUES('"
                +Pessoa.getCpf()+"','"
                +Pessoa.getNome()+"','"
                +Pessoa.getFixo()+"','"
                +Pessoa.getCelular()+"','"
                +Pessoa.getEmail()+"',"
                +Pessoa.getNumero()+",'"
                +Pessoa.getCep()+"','"
                +Pessoa.getTipo()+"')";
        
        boolean r = Model_Banco.Salvar(sqlString);
        String  CodAtualPessoa=null;
        if(r==true)
        {
          CodAtualPessoa =  Model_Banco.BuscaCodigo("PESSOA");    
        }
        
        return CodAtualPessoa;
    }
    
    public static Boolean Deletar(String Cod) throws SQLException
    {
        sqlString = "delete from PESSOA where (ID="+Cod+")";
        return Model_Banco.Deletar(sqlString);
    }    
    
    public static Ctrl_Pessoa  Verificar(String Cpf)
    {
        Ctrl_Pessoa Pessoa = new Ctrl_Pessoa();
        ResultSet rs = null;
        String sqlString ="select * from PESSOA where (CPF='" + Cpf + "')";
        try 
        {
            rs = Model_Banco.BuscaRegistro(sqlString);
            if (rs.next()) 
            {
                //ID, CPF, NOME, TELEFONE, CELULAR, EMAIL, NUMERO, CEP

                Pessoa.setId(rs.getString(1));
                Pessoa.setCpf(rs.getString(2));
                Pessoa.setNome(rs.getString(3));
                Pessoa.setFixo(rs.getString(4));
                Pessoa.setCelular(rs.getString(5));
                Pessoa.setEmail(rs.getString(6));
                Pessoa.setNumero(rs.getString(7));
                Pessoa.setCep(rs.getString(8));
            }
        } 
        catch (Exception e) 
        {
            return null;
        }
        return Pessoa;
    }
}
