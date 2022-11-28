package jogos;

import java.util.UUID;

public class Jogo {
  private String name; 
  private String linkImage;
  private String id;

  public Jogo(String name, String linkImage) {
    this.name = name;
    this.linkImage = linkImage;
    this.id = UUID.randomUUID().toString();
  }

  public String getName() { return this.name; }
  public String getLinkImage() { return this.linkImage; }
  public String getId() { return this.id; }

  public void setName(String name) { this.name = name; }
  public void setLinkImage(String li) { this.linkImage = li; }
 }