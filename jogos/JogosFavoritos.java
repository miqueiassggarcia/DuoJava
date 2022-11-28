package jogos;

import java.util.ArrayList;

public class JogosFavoritos {
  private ArrayList<String> jogosFavoritos = new ArrayList<String>();

  public void addJogoFavorito(String idJogo) {
    this.jogosFavoritos.add(idJogo);
  }

  public void removeJogoFavorito(String idJogo) {
    for (int i = 0; i < this.jogosFavoritos.size(); i++) {
      if (this.jogosFavoritos.get(i) == idJogo) {
        this.jogosFavoritos.remove(i);
        return;
      }
    }
  }

  public void listarJogosFavoritos() {
    for (int i = 0; i < this.jogosFavoritos.size(); i++) {
      System.out.println(this.jogosFavoritos.get(i));
    }
  }
}