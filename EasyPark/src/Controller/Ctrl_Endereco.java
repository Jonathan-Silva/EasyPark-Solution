
package Controller;

public class Ctrl_Endereco {
    
    private String Cep;
    private String Uf;
    private String Cidade;
    private String Logradouro;

    public String getCep() {
        return Cep;
    }

    public String getUf() {
        return Uf;
    }

    public String getCidade() {
        return Cidade;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public void setUf(String Uf) {
        this.Uf = Uf;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }
    
    
}
