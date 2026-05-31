package entities;

public class denuncianteEntity {
    //Atributo do denunciante
    private int id;

    //Geração do construtor
    public denuncianteEntity(int id) {
        this.id = id;
    }

     //Geração do Get
    public int getId() {
        return id;
    }

    //Geração do Set
    public void setId(int id) {
        this.id = id;
    }

    //Métodos de implementação futura para consulta da denuncia
    
    public String getDenuncia() {
    return null; // implementação futura
    }

    public String getConsultarStatus() {
    return null; // implementação futura
    }
}
