Sobre o Projeto
O Canal de Denúncias é um sistema back-end desenvolvido em Java como projeto acadêmico da disciplina de Linguagem de Programação. O objetivo do sistema é simular o fluxo completo de registro, acompanhamento e resolução de denúncias, aplicando na prática os principais conceitos da programação orientada a objetos.
A ideia central do projeto é oferecer uma estrutura organizada onde denunciantes possam registrar ocorrências, analistas possam acompanhar e investigar os casos, e administradores possam gerenciar os usuários e o andamento geral do sistema.

Funcionalidades
O sistema é composto por diferentes perfis de usuário, cada um com suas responsabilidades. O Administrador é o perfil com maior nível de acesso, sendo responsável por criar novos analistas, desativar usuários e redefinir senhas quando necessário. O Analista é o profissional responsável por receber, analisar e atualizar o status das denúncias ao longo do processo investigativo. Já o Denunciante é quem registra a ocorrência no sistema e pode acompanhar o status da sua denúncia por meio de um protocolo gerado automaticamente.
Cada denúncia registrada possui um protocolo de identificação único, uma descrição detalhada da ocorrência, uma categoria que classifica o tipo de irregularidade reportada, um status que indica em qual etapa do processo ela se encontra, além das datas de abertura e de última atualização.

Modelagem Orientada a Objetos
O projeto foi desenvolvido com foco na aplicação correta dos pilares da orientação a objetos. O encapsulamento foi aplicado em todas as classes, com os atributos declarados como privados e acessados apenas por meio de getters e setters. A herança foi utilizada nas classes Administrador e Analista, que estendem a classe base Usuario, reaproveitando os atributos e comportamentos comuns como nome, email, senha, perfil e status de ativo.
Para representar conjuntos fixos de valores, foram criados três enumeradores: o enum Categoria, que define os tipos de denúncia possíveis (Corrupção, Assédio, Fraude, Ambiental, Segurança e Outros); o enum Status, que controla as etapas do ciclo de vida de uma denúncia (Recebida, Em Análise, Em Investigação, Concluída e Arquivada); e o enum PerfilUsuario, que define os tipos de acesso disponíveis no sistema (Analista e Administrador).
A classe Denuncia se relaciona diretamente com os enums de Categoria e Status, demonstrando na prática o conceito de composição entre classes.

Como Rodar o Projeto
Para executar o projeto é necessário ter o Java JDK 17 ou superior instalado na máquina, além do VS Code com a extensão Extension Pack for Java.

Integrantes
Bianca Falcão
Carlos Zadi
Gabriel Vicentin
Gilcemeire Bonfim


Disciplina
Linguagem de Programação — Trabalho Interdisciplinar
Professora Luciene Cavalcanti
