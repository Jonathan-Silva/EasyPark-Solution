
package Controller;

public class Ctrl_Vaga {
    
    private String Id;
    private String Localizacao;
    private String IdTipo;
    private String Status;
    private String Preco;
    private String Descricao;

    public String getId() {
        return Id;
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public String getIdTipo() {
        return IdTipo;
    }

    public String getStatus() {
        return Status;
    }

    public String getPreco() {
        return Preco;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setLocalizacao(String Localizacao) {
        this.Localizacao = Localizacao;
    }

    public void setIdTipo(String IdTipo) {
        this.IdTipo = IdTipo;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setPreco(String Preco) {
        this.Preco = Preco;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
}
