package entities;

//Enumeradores
public enum perfilUsuarioEntity {
    ANALISTA, ADMINISTRADOR;

    public String getDescricao() {
        return this.name();
    }
}
