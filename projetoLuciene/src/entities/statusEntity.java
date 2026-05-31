package entities;

//Enumeradores
public enum statusEntity {
    RECEBIDA, EM_ANALISE, EM_INVESTIGACAO, CONCLUIDA, ARQUIVADA;

    public String getDescricao() {
        return this.name();
    }
}
