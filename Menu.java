import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
  public static Scanner scanInt = new Scanner(System.in);
  public static Scanner scanString = new Scanner(System.in);

  

  public void perfil() {
    int escolha = 0;
    while (escolha < 1 || escolha > 3) {
      System.out.println("1-listar perfis favoritados");
      System.out.println("2-listar jogos favoritados");
      System.out.println("3-Voltar para home");
      escolha = scanInt.nextInt();
    }

    if (escolha == 1) {
      System.out.println("fatoritos");
    }

    if (escolha == 2) {
      System.out.println("jogos");
    }

    if (escolha == 3) {
      home();
    }

    perfil();
  }

  public void posts() {
    int escolha = 0;
    while (escolha < 1 || escolha > 4) {
      System.out.println("1-Enviar mensagem");
      System.out.println("2-Criar post");
      System.out.println("3-Favoritar usuario");
      System.out.println("4-Voltar para home");
      escolha = scanInt.nextInt();
    }

    if (escolha == 1) {
      System.out.println("Digite a mensagem:");
      String mensagem = scanString.nextLine();

      System.out.println(mensagem);
    }
    if (escolha == 2) {
      System.out.println("Adicione o titulo:");
      String titulo = scanString.nextLine();
      System.out.println("Adicione uma descrição:");
      String descricao = scanString.nextLine();
      System.out.println("Adicione uma foto:");
      String foto = scanString.nextLine();

      System.out.println(titulo);
      System.out.println(descricao);
      System.out.println(foto);
    }
    if (escolha == 3) {
      System.out.println("Usuario favoritado");
    }
    if (escolha == 4) {
      home();
    }

    posts();
  }

  public void selecionarJogo() {
    int escolha = 0;
    while (escolha < 1 || escolha > 5) {
      System.out.println("1-League of Legends");
      System.out.println("2-Dama");
      System.out.println("3-Doom Eternal");
      System.out.println("4-God Of War Ragnarock");
      System.out.println("5-Voltar para home");
      escolha = scanInt.nextInt();
    }

    if (escolha == 1) {
      System.out.println("listar posts de League fo Legends");
    }

    if (escolha == 2) {
      System.out.println("listar posts de Dama");
    }

    if (escolha == 3) {
      System.out.println("Listar posts de Doom Eternal");
    }
    
    if (escolha == 4) {
      System.out.println("Listar posts de God Of War Ragnarock");
    }

    if (escolha == 5) {
      home();
    }

    if (escolha != 5) {
      posts();
    }
  }

  

  public ArrayList<String> inicio() {
    ArrayList<String> user = new ArrayList<String>();

    int escolha = 1;
    
    System.out.println("                      DUO\n1-Login\n2-Cadastro\n");
    escolha = scanInt.nextInt();

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
}