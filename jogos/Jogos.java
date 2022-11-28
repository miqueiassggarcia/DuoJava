package jogos;

import java.util.ArrayList;

public class Jogos {
  private ArrayList<Jogo> jogosList = new ArrayList<Jogo>();

  public String addJogo(String name, String linkImage) {
    Jogo j = new Jogo(name, linkImage);
    jogosList.add(j);
    return j.getId();
  }

  public Jogo getJogoId(String idJogo) {
    for (int i = 0; i < this.jogosList.size(); i++) {
      Jogo j = jogosList.get(i);
      if (j.getId() == idJogo) {
        return j;
      }
    }

    return null;
  }

  public Jogo getJogoName(String jogoName) {
    for (int i = 0; i < this.jogosList.size(); i++) {
      Jogo j = jogosList.get(i);
      if (j.getName() == jogoName) {
        return j;
      }
    }

    return null;
  }

  public ArrayList<Jogo> getJogos(int limit) {
    int added = 0;
    ArrayList<Jogo> jogos = new ArrayList<Jogo>();
    int i = 0;

    while (added <= limit && i < this.jogosList.size()) {
      jogos.add(this.jogosList.get(i));
      i++;
    }

    return jogos;
  }
}