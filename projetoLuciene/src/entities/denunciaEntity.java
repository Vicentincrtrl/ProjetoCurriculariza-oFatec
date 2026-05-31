package entities;
import java.time.LocalDateTime;

public class denunciaEntity {
    //Atributos da denuncia
    private String            protocolo;
    private int               id;
    private String            descricao;
    private LocalDateTime     dataAbertura;
    private LocalDateTime     dataAtualizacao;
    private categoriaEntity   categoria;
    private statusEntity      status;

    //Geração do construtor
    public denunciaEntity(String protocolo, int id, String descricao, LocalDateTime dataAbertura,
            LocalDateTime dataAtualizacao, categoriaEntity categoria, statusEntity status) {
        this.protocolo       = protocolo;
        this.id              = id;
        this.descricao       = descricao;
        this.dataAbertura    = dataAbertura;
        this.dataAtualizacao = dataAtualizacao;
        this.categoria       = categoria;
        this.status          = status;
    }

    //Geração dos Getters e Setters

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public categoriaEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(categoriaEntity categoria) {
        this.categoria = categoria;
    }

    public statusEntity getStatus() {
        return status;
    }

    public void setStatus(statusEntity status) {
        this.status = status;
    }

    //Método toString para exibir os dados da denúncia
    @Override
    public String toString() {
        return "Denuncia{protocolo='" + protocolo + "', categoria=" +
               categoria.getDescricao() + ", status=" + status.getDescricao() +
               ", descricao='" + descricao + "'}";
    }

}