
package Controller;

public class Ctrl_Funcionario  extends Ctrl_Pessoa {
    
    private String Login;
    private String Senha;
    private String Tipo;
    private String IdPessoa;
    private String IdFuncionario;

    public String getLogin() {
        return Login;
    }

    public String getSenha() {
        return Senha;
    }

    public String getIdPessoa() {
        return IdPessoa;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public void setIdPessoa(String IdPessoa) {
        this.IdPessoa = IdPessoa;
    }

    public String getIdFuncionario() {
        return IdFuncionario;
    }

    public void setIdFuncionario(String IdFuncionario) {
        this.IdFuncionario = IdFuncionario;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    
}
