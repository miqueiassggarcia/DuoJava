import usuarios.*;
import posts.*;
import jogos.*;

public class Main {
  public static void main(String[] args) {
    Posts posts = new Posts();
    Jogos jogos = new Jogos();
    UsuarioPadraoBuilder userPadraoBuilder = new UsuarioPadraoBuilder();

    // adicionando jogos
    String csgoId = jogos.addJogo("csgo", "no image");
    String ddraceId = jogos.addJogo("DDrace", "no image");
    // ######################################################

    
    // criando usuarios
    userPadraoBuilder.setName("Gabriel");
    userPadraoBuilder.setSexo("Indefinido");
    userPadraoBuilder.setEmail("Seila@gmail.com");
    userPadraoBuilder.setHashSenha("87654321");
    userPadraoBuilder.setLinkFoto("encurtador.com.br/ioBLU");
    UsuarioPadrao user1 = userPadraoBuilder.getUser();
    String user1Id = user1.getId();
    userPadraoBuilder.reset();

    userPadraoBuilder.setName("Helena");
    userPadraoBuilder.setSexo("Feminino");
    userPadraoBuilder.setEmail("seila2@gmail.com");
    userPadraoBuilder.setHashSenha("12345678");
    userPadraoBuilder.setLinkFoto("NO LINK");
    UsuarioPadrao user2 = userPadraoBuilder.getUser();
    String user2Id = user2.getId();
    userPadraoBuilder.reset();
    // #####################################################

    // adicionando tags
    user1.tags.addTag("profissional");
    user1.tags.addTag("dormir nao da XP");
    user1.tags.addTag("quem precisa viver? kkkk");

    System.out.println("Tags user1: ");
    user1.tags.listarTags();
    System.out.println("\n\n");
    // #####################################################

    // adicionando usuarios favoritos
    user1.usuariosFavoritos.addUsuarioFavorito(user2Id);
    System.out.println("\nUsuarios favoritos do user1: ");
    user1.usuariosFavoritos.listarUsuariosFavoritos();
    System.out.println("\n\n");
    // ##################################################### 

    // adicionando jogos favoritos
    user1.jogosFavoritos.addJogoFavorito(csgoId);
    user1.jogosFavoritos.addJogoFavorito(ddraceId);
    System.out.println("Jogos favoritos do user1: ");
    user1.jogosFavoritos.listarJogosFavoritos();
    System.out.println("\n\n");
    // ######################################################
    
    // criando posts
    String post1Id = posts.criarPost("urlImage", ddraceId, user1Id, "vamos duo?", "isso ai meu patrão", "linkDiscord");
    String post2Id = posts.criarPost("urlImage", ddraceId, user1Id, "vamos duo2?", "descricao", "linkDiscord");
    // #####################################################

    // listando posts
    System.out.println("\nPosts do User1");
    posts.listarPostsUser(user1Id);

    System.out.println("\nPosts DDrace");
    posts.listarPostsJogo(ddraceId);

    posts.apagarPost(post1Id);

    System.out.println("\nPosts DDrace");
    posts.listarPostsJogo(ddraceId);
    // ######################################################

    // listando notificacoes
    System.out.println("\n\nNotificacoes user1:\n");
    String not1Id = user1.notificacoes.criarNotificacao("nova notificacao!!");
    String not2Id = user1.notificacoes.criarNotificacao("oiiiiii eu quero jogar contigo!!!");
    String not3Id = user1.notificacoes.criarNotificacao("oi :(!!");

    user1.notificacoes.visualizarNotificacao(not3Id);

    user1.notificacoes.listarNotificacoes(10);
    System.out.println("Total notificacoes: " + user1.notificacoes.getTotalNotificacoes());
    System.out.println("Total não visualizado: " + user1.notificacoes.getTotalNotificacoesNV());
    // #######################################################


    // excluindo a conta
    System.out.println("\n\nExcluindo a conta user1: ");
    user1.excluirConta();

    
    System.out.println("\n\ndeu tudo certo mano!!");
  }
}