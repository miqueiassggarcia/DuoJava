import usuarios.*;
import posts.*;
import jogos.*;
import menu.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MainNew {
  public static Scanner scanInt = new Scanner(System.in);
  public static Scanner scanString = new Scanner(System.in);

  public void inicio() {
    int escolha = 0;
    while (escolha < 1 || escolha > 2) {
      System.out.println("                      DUO\n1-Login\n2-Cadastro\n");
      escolha = scanInt.nextInt();
    }

    if (user.size() == 5) {
      userPadraoBuilder.setName("Gabriel");
      userPadraoBuilder.setSexo("Indefinido");
      userPadraoBuilder.setEmail("Seila@gmail.com");
      userPadraoBuilder.setHashSenha("87654321");
      userPadraoBuilder.setLinkFoto("encurtador.com.br/ioBLU");
    }

    if (escolha == 1) {
      System.out.println("Digite o nome:");
      String nome = scanString.nextLine();
      user.add(nome);

      System.out.println("Digite o email:");
      String email = scanString.nextLine();
      user.add(email);

      System.out.println("Digite o seu genero:");
      String genero = scanString.nextLine();
      user.add(genero);

      System.out.println("Digite a sua senha:");
      String senha = scanString.nextLine();
      user.add(senha);

      System.out.println("Adicione uma foto:");
      String foto = scanString.nextLine();
      user.add(foto);

      return user;
    } else {
      System.out.println("Digite o email:");
      String email = scanString.nextLine();
      user.add(email);

      System.out.println("Digite a sua senha:");
      String senha = scanString.nextLine();
      user.add(senha);

      return user;
    }
  }  

  public static void main(String[] args) {
    Posts posts = new Posts();
    Jogos jogos = new Jogos();
    UsuarioPadraoBuilder userPadraoBuilder = new UsuarioPadraoBuilder();

    // adicionando jogos
    String csgoId = jogos.addJogo("csgo", "no image");
    String ddraceId = jogos.addJogo("DDrace", "no image");
    // ######################################################

    // pegando dados do usuário
    Menu menu = new Menu();
    ArrayList<String> user = menu.inicio();

    UsuarioPadrao userPadrao = userPadraoBuilder.getUser();
    String userPadraoId = userPadrao.getId();
    userPadraoBuilder.reset();

    int escolha = menu.home();

    if (escolha == 0) {
      menu.inicio();
    }
    if (escolha == 1) {
      menu.configuracoes();
    }
    if (escolha == 2) {
      menu.perfil();
    }
    if (escolha == 3) {
      System.out.println("notificacoes");
    }
    if (escolha == 4) {
      System.out.println("Favoritos");
    }
    if (escolha == 5) {
      menu.selecionarJogo();
    }

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
    userPadrao.tags.addTag("profissional");
    userPadrao.tags.addTag("dormir nao da XP");
    userPadrao.tags.addTag("quem precisa viver? kkkk");

    System.out.println("Tags userPadrao: ");
    userPadrao.tags.listarTags();
    System.out.println("\n\n");
    // #####################################################

    // adicionando usuarios favoritos
    userPadrao.usuariosFavoritos.addUsuarioFavorito(user2Id);
    System.out.println("\nUsuarios favoritos do userPadrao: ");
    userPadrao.usuariosFavoritos.listarUsuariosFavoritos();
    System.out.println("\n\n");
    // ##################################################### 

    // adicionando jogos favoritos
    userPadrao.jogosFavoritos.addJogoFavorito(csgoId);
    userPadrao.jogosFavoritos.addJogoFavorito(ddraceId);
    System.out.println("Jogos favoritos do userPadrao: ");
    userPadrao.jogosFavoritos.listarJogosFavoritos();
    System.out.println("\n\n");
    // ######################################################
    
    // criando posts
    String post1Id = posts.criarPost("urlImage", ddraceId, userPadraoId, "vamos duo?", "isso ai meu patrão", "linkDiscord");
    String post2Id = posts.criarPost("urlImage", ddraceId, userPadraoId, "vamos duo2?", "descricao", "linkDiscord");
    // #####################################################

    // listando posts
    System.out.println("\nPosts do userPadrao");
    posts.listarPostsUser(userPadraoId);

    System.out.println("\nPosts DDrace");
    posts.listarPostsJogo(ddraceId);

    posts.apagarPost(post1Id);

    System.out.println("\nPosts DDrace");
    posts.listarPostsJogo(ddraceId);
    // ######################################################

    // listando notificacoes
    System.out.println("\n\nNotificacoes userPadrao:\n");
    String not1Id = userPadrao.notificacoes.criarNotificacao("nova notificacao!!");
    String not2Id = userPadrao.notificacoes.criarNotificacao("oiiiiii eu quero jogar contigo!!!");
    String not3Id = userPadrao.notificacoes.criarNotificacao("oi :(!!");

    userPadrao.notificacoes.visualizarNotificacao(not3Id);

    userPadrao.notificacoes.listarNotificacoes(10);
    System.out.println("Total notificacoes: " + userPadrao.notificacoes.getTotalNotificacoes());
    System.out.println("Total não visualizado: " + userPadrao.notificacoes.getTotalNotificacoesNV());
    // #######################################################


    // excluindo a conta
    System.out.println("\n\nExcluindo a conta userPadrao: ");
    userPadrao.excluirConta();

    
    System.out.println("\n\ndeu tudo certo mano!!");
  }
}