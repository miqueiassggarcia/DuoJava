package menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
  public static Scanner scanInt = new Scanner(System.in);
  public static Scanner scanString = new Scanner(System.in);


  

  public int home() {
    int escolha = 0;
    while (escolha < 0 || escolha > 5) {
      System.out.println("                               Home");
      System.out.println("1-Configurações");
      System.out.println("2-Perfil");
      System.out.println("3-Notificações");
      System.out.println("4-Favoritos");
      System.out.println("5-Selecionar jogo");
      System.out.println("0-Sair");
      escolha = scanInt.nextInt();
    }

    return escolha;
  }

  public int configuracoes() {
    int escolha = 0;
    while (escolha < 1 || escolha > 3) {
      System.out.println("                               Perfil");
      System.out.println("1-Editar dados");
      System.out.println("2-Apagar conta");
      System.out.println("3-Voltar para home");
      escolha = scanInt.nextInt();
    }

    if (escolha == 1) {
      System.out.println("Digite um novo nome:");
      String nome = scanString.nextLine();
      System.out.println("Digite um novo genero:");
      String genero = scanString.nextLine();
      System.out.println("Digite um novo link de foto:");
      String link = scanString.nextLine();
      System.out.println(nome);
      System.out.println(genero);
      System.out.println(link);
    }

    if (escolha == 2) {
      System.out.println("Conta deletada");
      inicio();
    }

    if (escolha == 3) {
      home();
    }

    home();
  }
}
