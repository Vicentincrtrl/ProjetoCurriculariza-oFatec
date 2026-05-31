package entities;

//Enumeradores
public enum categoriaEntity {
    CORRUPCAO, ASSEDIO, FRAUDE, AMBIENTAL, SEGURANCA, OUTROS;

    public String getDescricao() {
        return this.name();
    }
}
