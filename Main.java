/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Miqueias
 */
import usuarios.*;
import posts.*;
import jogos.*;
import views.Cadastro;
import views.Inicio;
import testes.*;

public class Main {
  public static void main(String[] args) {
    // Rodando testes
    Testes testes = new Testes();
    testes.testar();

    // Inicioando views
    Inicio inicio = new Inicio();
    inicio.setVisible(true);
    
    
    // Exemplos de testes das funcionalidades
    Posts posts = new Posts();
    Jogos jogos = new Jogos();
    UsuarioPadraoBuilder userPadraoBuilder = new UsuarioPadraoBuilder();

    
    // ##############################################
    // Adicionando jogos
    String csgoId = jogos.addJogo("csgo", "no image");
    String ddraceId = jogos.addJogo("DDrace", "no image");
    // ##############################################

    
    // ##############################################
    // Criando usuários
    userPadraoBuilder.setName("Gabriel");
    userPadraoBuilder.setSexo("Indefinido");
    userPadraoBuilder.setEmail("gabriel@gmail.com");
    userPadraoBuilder.setHashSenha("87654321");
    userPadraoBuilder.setLinkFoto("imagem.com");

    // Retorno da criação e reset do builder para nova criação
    UsuarioPadrao user1 = userPadraoBuilder.getUser();
    String user1Id = user1.getId();
    userPadraoBuilder.reset();

    // Criando novo usuário
    userPadraoBuilder.setName("Helena");
    userPadraoBuilder.setSexo("Feminino");
    userPadraoBuilder.setEmail("seila2@gmail.com");
    userPadraoBuilder.setHashSenha("12345678");
    userPadraoBuilder.setLinkFoto("NO LINK");
    UsuarioPadrao user2 = userPadraoBuilder.getUser();
    String user2Id = user2.getId();
    userPadraoBuilder.reset();
    // ################################################
    

    // ##############################################
    // Adicionando tags
    user1.tags.addTag("profissional");
    user1.tags.addTag("dormir nao da XP");
    user1.tags.addTag("quem precisa viver? kkkk");

    // Mostrando resultado da inserção
    System.out.println("Tags user1: ");
    user1.tags.listarTags();
    System.out.println("\n\n");
    // ##############################################


    // ##############################################
    // Adicionando usuarios favoritos
    user1.usuariosFavoritos.addUsuarioFavorito(user2Id);

    // Mostrando resultado da inserção
    System.out.println("\nUsuarios favoritos do user1: ");
    user1.usuariosFavoritos.listarUsuariosFavoritos();
    System.out.println("\n\n");
    // ##############################################


    // ##############################################
    // Adicionando jogos favoritos
    user1.jogosFavoritos.addJogoFavorito(csgoId);
    user1.jogosFavoritos.addJogoFavorito(ddraceId);

    // Mostrando resultado da inserção
    System.out.println("Jogos favoritos do user1: ");
    user1.jogosFavoritos.listarJogosFavoritos();
    System.out.println("\n\n");
    // ##############################################
    
    // ##############################################
    // Criando posts
    String post1Id = posts.criarPost("urlImage", ddraceId, user1Id, "vamos duo?", "isso ai meu patrão", "linkDiscord");
    String post2Id = posts.criarPost("urlImage", ddraceId, user1Id, "vamos duo2?", "descricao", "linkDiscord");

    // Listando posts do usuário
    System.out.println("\nPosts do User1");
    posts.listarPostsUser(user1Id);

    // Listando posts vinculados ao jogo
    System.out.println("\nPosts DDrace");
    posts.listarPostsJogo(ddraceId);

    // Apagando post
    posts.apagarPost(post1Id);

    System.out.println("\nPosts DDrace");
    posts.listarPostsJogo(ddraceId);
    // ##############################################

    // ##############################################
    // Criando notificações
    System.out.println("\n\nNotificacoes user1:\n");

    String not1Id = user1.notificacoes.criarNotificacao("nova notificacao!!");
    String not2Id = user1.notificacoes.criarNotificacao("oiiiiii eu quero jogar contigo!!!");
    String not3Id = user1.notificacoes.criarNotificacao("oi :(!!");
    user1.notificacoes.visualizarNotificacao(not3Id);

    // Listar notificações
    user1.notificacoes.listarNotificacoes(10);
    System.out.println("Total notificacoes: " + user1.notificacoes.getTotalNotificacoes());
    System.out.println("Total não visualizado: " + user1.notificacoes.getTotalNotificacoesNV());
    // ##############################################


    // ##############################################
    // Excluindo a conta
    System.out.println("\n\nExcluindo a conta user1: ");
    user1.excluirConta();
    // ##############################################

    
    System.out.println("\n\nDeu tudo certo, graças a Deus!!");
  }
}