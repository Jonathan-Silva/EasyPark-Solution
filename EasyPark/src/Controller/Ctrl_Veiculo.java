
package Controller;

public class Ctrl_Veiculo {
    
    private String Id;
    private String Placa;
    private String IdTipoVaga;
    private String IdMotorista;

    public String getId() {
        return Id;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getIdTipoVaga() {
        return IdTipoVaga;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setIdTipoVaga(String TipoVaga) {
        this.IdTipoVaga = TipoVaga;
    }

    public String getIdMotorista() {
        return IdMotorista;
    }

    public void setIdMotorista(String IdMotorista) {
        this.IdMotorista = IdMotorista;
    }
    
}
