package entities;

public class usuarioEntity{
    //Atributos do meu usuário
    private int                  id;
    private String               nome;
    private String               email;
    private String               senha;
    private perfilUsuarioEntity  perfil;
    private boolean              ativo;

    //Geração do Construtor
    public usuarioEntity(int id, String nome, String email, String senha, perfilUsuarioEntity perfil, boolean ativo) {
        this.id     = id;
        this.nome   = nome;
        this.email  = email;
        this.senha  = senha;
        this.perfil = perfil;
        this.ativo  = ativo;
    }

    //Geração dos Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public perfilUsuarioEntity getPerfil() {
        return perfil;
    }

    public void setPerfil(perfilUsuarioEntity perfil) {
        this.perfil = perfil;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}