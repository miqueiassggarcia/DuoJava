package testes;
import testes.testes_unitarios.*;
import java.util.ArrayList;

public class Testes {
  private ArrayList<Tests> tests = new ArrayList<Tests>();

  public Testes() {
    this.tests.add(new TestUsuarioPadrao());
    this.tests.add(new TestUsuarioAdmin());
    this.tests.add(new TestPosts());
    this.tests.add(new TestNotificacoes());
    this.tests.add(new TestJogos());
  }

  public void testar() {
    for (int i = 0; i < this.tests.size(); i++) {
      this.tests.get(i).test();
    }
  }
}