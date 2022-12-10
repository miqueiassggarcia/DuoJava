package testes.testes_unitarios;
import jogos.*;

public class TestJogos extends Test implements Tests {
  public void test() {
    Jogos jogos = new Jogos();
  
    String jogo1Name = "ddnet";
    String jogo1LinkImage = "2938283";
  
    String jogo2Name = "csgo";
    String jogo2LinkImage = "kdkskd";
  
    String idJogo1 = jogos.addJogo(jogo1Name, jogo1LinkImage);
    String idJogo2 = jogos.addJogo(jogo2Name, jogo2LinkImage);
  
    Jogo jogo1 = jogos.getJogoId(idJogo1);
    Jogo jogo2 = jogos.getJogoId(idJogo2);
  
    String jogo1NameResultado = jogo1.getName();
    String jogo1LinkImageResultado = jogo1.getLinkImage();
    String jogo1IdResultado = jogo1.getId();
    String jogo2NameResultado = jogo2.getName();
    String jogo2LinkImageResultado = jogo2.getLinkImage();
    String jogo2IdResultado = jogo2.getId();
  
    assertEquals(jogo1Name, jogo1NameResultado);
    assertEquals(jogo1LinkImage, jogo1LinkImageResultado);
    assertEquals(idJogo1, jogo1IdResultado);
    assertEquals(jogo2Name, jogo2NameResultado);
    assertEquals(jogo2LinkImage, jogo2LinkImageResultado);
    assertEquals(idJogo2, jogo2IdResultado);

    this.resultado("TestJogos");
  }
}