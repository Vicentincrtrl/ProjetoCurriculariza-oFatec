package entities;

public class administradorEntity extends usuarioEntity {
    private String nivelAcesso;

    // Geração do construtor
    public administradorEntity(int id, String nome, String email, String senha, perfilUsuarioEntity perfil, boolean ativo,
            String nivelAcesso) {
        super(id, nome, email, senha, perfil, ativo);
        this.nivelAcesso = nivelAcesso;
    }

    // Geração do get
    public String getNivelAcesso() {
        return nivelAcesso;
    }

    // Geração do set
    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    // Métodos para a classe administrador criar, desativar e redefinir a senha dos usuários.

    public void criarAnalista() {
        System.out.println("Analista criado pelo administrador.");
    }

    public void desativarUsuario() {
        System.out.println("Usuário desativado pelo administrador.");
    }

    public void redefinirSenha() {
        System.out.println("Senha redefinida pelo administrador.");
    }

}