package notificacoes;

import java.util.ArrayList;

public class Notificacoes {
  private ArrayList<Notificacao> notificacoes = new ArrayList<Notificacao>();
  private int notificacoesNaoVisualizadas = 0;

  public String criarNotificacao(String descricao) {
    Notificacao n = new Notificacao(descricao);
    notificacoes.add(n);
    this.notificacoesNaoVisualizadas++;
    return n.getId();
  }

  public Notificacao getNotificacao(String idNot) {
    for (int i = 0; i < this.notificacoes.size(); i++) {
      Notificacao n = this.notificacoes.get(i);
      if (n.getId() == idNot) {
        return n;
      }
    }

    return null;
  }

  public void visualizarNotificacao(String idNot) {
    for (int i = 0; i < this.notificacoes.size(); i++) {
      Notificacao n = this.notificacoes.get(i);
      if (n.getId() == idNot) {
        if(!n.getVisualizado()) {
          n.visualizar();
          this.notificacoesNaoVisualizadas--;
          return;
        }
      }
    }
  }

  public int getTotalNotificacoes() {
    return this.notificacoes.size();
  }

  // pegar total de notificacoes não visualizadas
  public int getTotalNotificacoesNV() {
    return this.notificacoesNaoVisualizadas;
  }

  public void listarNotificacoes(int limit) {
    int i = 0;
    while (i < limit && i < this.notificacoes.size()) {
      this.listarNotificacao(this.notificacoes.get(i));
      i++;
    }
  }

  public void listarNotificacao(Notificacao n) {
    System.out.println("Id: " + n.getId());
    System.out.println("Data: " + n.getData());
    System.out.println("Descricao: " + n.getDescricao());
    System.out.println("Visualizado: " + n.getVisualizado());
    System.out.println("\n");
  }

  
}