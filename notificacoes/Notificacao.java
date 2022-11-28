package notificacoes;

import java.time.LocalDateTime;
import java.util.UUID;

public class Notificacao {
  private LocalDateTime data;
  private String descricao;
  private boolean visualizado;
  private String id;

  public Notificacao(String descricao) {
    this.descricao = descricao;
    this.data = LocalDateTime.now();
    this.visualizado = false;
    this.id = UUID.randomUUID().toString();
  }

  public LocalDateTime getData() { return this.data; }
  public String getDescricao() { return this.descricao; }
  public void visualizar() { this.visualizado = true; }
  public boolean getVisualizado() { return this.visualizado; }
  public String getId() { return this.id; }
}