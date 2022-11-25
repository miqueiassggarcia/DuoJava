package objects;

import java.util.ArrayList;

public class Jogos {
  private String nome;
  private String urlImagem;
  private ArrayList<Posts> posts;

  public Jogos() {

  }

  public Jogos(Jogos target) {
    if(target != null) {
      this.nome = target.getnome();
      this.urlImagem = target.geturlImagem();
      this.posts = target.getPosts();
    }
  }

  public String getnome() {
    return this.nome;
  }

  public String geturlImagem() {
    return this.urlImagem;
  }

  public void setnome(String nome) {
    this.nome = nome;
  }
  
  public void seturlImagem(String urlImagem) {
    this.urlImagem = urlImagem;
  }

  public ArrayList<Posts> getPosts() {
    return this.posts;
  }

  public void setPosts(ArrayList<Posts> posts) {
    this.posts = posts;
  }
}
