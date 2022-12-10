package testes.testes_unitarios;
import notificacoes.*;

public class TestNotificacoes extends Test implements Tests {
  public void test() {
    Notificacoes notificacoes = new Notificacoes();
  
    String not1Descricao = "pirpirpin";
    String not2Descricao = "me atende ai!!";
    
    String idNot1 = notificacoes.criarNotificacao(not1Descricao);
    String idNot2 = notificacoes.criarNotificacao(not2Descricao);
  
    Notificacao not1 = notificacoes.getNotificacao(idNot1);
    Notificacao not2 = notificacoes.getNotificacao(idNot2);
    String not1DescricaoResultado = not1.getDescricao();
    String not2DescricaoResultado = not2.getDescricao();
    String not1IdResultado = not1.getId();
    String not2IdResultado = not2.getId();
  
    assertEquals(not1Descricao, not1DescricaoResultado);
    assertEquals(not2Descricao, not2DescricaoResultado);
    assertEquals(idNot1, not1IdResultado);
    assertEquals(idNot2, not2IdResultado);
  
    notificacoes.visualizarNotificacao(idNot2);
  
    int totalNotificacoesResultado = notificacoes.getTotalNotificacoes();
    int totalNotificacoesNVResultado = notificacoes.getTotalNotificacoesNV();
  
    assertEquals(2, totalNotificacoesResultado);
    assertEquals(1, totalNotificacoesNVResultado);

    this.resultado("TestNotificacoes");
  }
}