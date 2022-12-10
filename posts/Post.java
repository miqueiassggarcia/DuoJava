package posts;

import java.time.LocalDateTime;
import java.util.UUID;

public class Post {
  private LocalDateTime dataPostagem;
  private String linkImage;
  private String idJogo;
  private String idUser;
  private String titulo;
  private String descricao;
  private String linkDiscord;
  private String id;

  public Post(String linkImage, String idJogo, String idUser, String titulo, String descricao, String linkDiscord) {
    this.dataPostagem = LocalDateTime.now();
    this.linkImage = linkImage;
    this.idJogo = idJogo;
    this.idUser = idUser;
    this.titulo = titulo;
    this.descricao = descricao;
    this.linkDiscord = linkDiscord;
    this.id = UUID.randomUUID().toString();
  }

  public LocalDateTime getDataDePostagem() { return this.dataPostagem; }
  public String getLinkImage() { return this.linkImage; }
  public String getIdJogo () { return this.idJogo; }
  public String getIdUser() { return this.idUser; }
  public String getTitulo() { return this.titulo; }
  public String getDescricao() { return this.descricao; }
  public String getLinkDiscord() { return this.linkDiscord; }
  public String getId() { return this.id; }

  public void setTitulo(String titulo) { this.titulo = titulo; }  
  public void setDescricao(String descricao) { this.descricao = descricao; }
  public void setlinkDiscord(String linkDoDiscord) { this.linkDiscord = linkDoDiscord; }  
}