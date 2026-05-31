package entities;

public class analistaEntity extends usuarioEntity {
    private String matricula;

    // Geração do construtor
    public analistaEntity(int id, String nome, String email, String senha, perfilUsuarioEntity perfil, boolean ativo,
            String matricula) {
        super(id, nome, email, senha, perfil, ativo);
        this.matricula = matricula;
    }

    // Geração do get
    public String getMatricula() {
        return matricula;
    }

    // Geração do set
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}