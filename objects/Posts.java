package objects;

import java.sql.Date;

public class Posts {
  private Date dataDePostagem;
  private String titulo;
  private String descricao;
  private String linkDoDiscord;

  public Date getDataDePostagem() {
    return this.dataDePostagem;
  }
  public String getTitulo() {
    return this.titulo;
  }
  public String getDescricao() {
    return this.descricao;
  }
  public String getLinkDoDiscord() {
    return this.linkDoDiscord;
  }

  public void setdataDePostagem(Date dataDePostagem) {
    this.dataDePostagem = dataDePostagem;
  }  
  public void settitulo(String titulo) {
    this.titulo = titulo;
  }  
  public void setdescricao(String descricao) {
    this.descricao = descricao;
  }
  public void setlinkDoDiscord(String linkDoDiscord) {
    this.linkDoDiscord = linkDoDiscord;
  }  
}