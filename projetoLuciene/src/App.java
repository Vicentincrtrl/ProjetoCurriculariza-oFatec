import entities.*;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE DENÚNCIAS ===\n");

        // --- Criando um Administrador para o nosso canal
        //Instanciando um objeto 
        administradorEntity admin = new administradorEntity(
        //Atributos colocados de forma aleatória
            1, "Carlos Silva", "carlos@sistema.com", "senha123",
            perfilUsuarioEntity.ADMINISTRADOR, true, "TOTAL"
        );

        //Saída das informações criadas para a classe administrador
        System.out.println("Administrador criado: " + admin.getNome());
        System.out.println("Nível de acesso: " + admin.getNivelAcesso());

        // --- Criando um Analista ---
        //Instanciando um objeto
        analistaEntity analista = new analistaEntity(
        //Atributos colocados de forma aleatória
            2, "Ana Souza", "ana@sistema.com", "senha456",
            perfilUsuarioEntity.ANALISTA, true, "MAT-2024-001"
        );

        //Saída das informações criadas para a classe analista
        System.out.println("\nAnalista criado: " + analista.getNome());
        System.out.println("Matrícula: " + analista.getMatricula());

        // --- Criando um Denunciante ---
        //Instanciando um objeto
        denuncianteEntity denunciante = new denuncianteEntity(10);
        //Saída das informações criadas para a classe denunciante
        System.out.println("\nDenunciante registrado com ID: " + denunciante.getId());

        // --- Criando uma Denúncia ---
        denunciaEntity denuncia = new denunciaEntity(
            "PROT-2024-001",
            101,
            "Suspeita de desvio de verba pública no setor X.",
            LocalDateTime.now(),
            LocalDateTime.now(),
            categoriaEntity.CORRUPCAO,
            statusEntity.RECEBIDA
        );

        System.out.println("\n--- Denúncia Registrada ---");
        System.out.println(denuncia.toString());

        // --- Simulando fluxo de atualização de status ---
        System.out.println("\n--- Atualizando status da denúncia ---");
        denuncia.setStatus(statusEntity.EM_ANALISE);
        System.out.println("Novo status: " + denuncia.getStatus());

        denuncia.setStatus(statusEntity.EM_INVESTIGACAO);
        System.out.println("Novo status: " + denuncia.getStatus());

        denuncia.setStatus(statusEntity.CONCLUIDA);
        System.out.println("Novo status: " + denuncia.getStatus());

        // --- Testando ações do Administrador ---
        System.out.println("\n--- Ações do Administrador ---");
        admin.criarAnalista();
        admin.desativarUsuario();
        admin.redefinirSenha();

        // --- Consultando categoria e status ---
        System.out.println("\n--- Informações da Denúncia ---");
        System.out.println("Categoria: " + denuncia.getCategoria().getDescricao());
        System.out.println("Status atual: " + denuncia.getStatus().getDescricao());

        System.out.println("\n=== FIM DA DEMONSTRAÇÃO ===");
    }
}