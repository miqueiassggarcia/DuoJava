package posts;

import java.util.ArrayList;

public class Posts {
  private ArrayList<Post> posts = new ArrayList<Post>();
  
  public String criarPost(String urlImage, String idJogo, 
                          String idUser, String titulo, 
                          String descricao, String linkDiscord) {
    Post newPost = new Post(urlImage, idJogo, 
                            idUser, titulo, 
                            descricao, linkDiscord);
    this.posts.add(newPost);
    return newPost.getId();
  }

  public Post getPost(String idPost) {
    for (int i = 0; i < this.posts.size(); i++) {
      Post p = this.posts.get(i);
      if (p.getId() == idPost) {
        return p;
      }
    }

    return null;
  }

  public ArrayList<Post> getPostsUser(String idUser) {
    ArrayList<Post> postsUser = new ArrayList<Post>();
    
    for (int i = 0; i < this.posts.size(); i++) {
      Post p = this.posts.get(i);
      if (p.getIdUser() == idUser) {
        postsUser.add(p);
      }
    }

    return (postsUser);
  }

  public ArrayList<Post> getPostsJogo(String idJogo) {
    ArrayList<Post> postsJogo = new ArrayList<Post>();

    for (int i = 0; i < this.posts.size(); i++) {
      Post p = this.posts.get(i);
      if (p.getIdJogo() == idJogo) {
        postsJogo.add(p);
      }
    }

    return postsJogo;
  }

  public boolean apagarPost(String idPost) {
    for (int i = 0; i < this.posts.size(); i++) {
      if (this.posts.get(i).getId() == idPost) {
        this.posts.remove(i);
        return true;
      }
    }

    return false;
  }

  public void listarPostsUser(String idUser) {
    ArrayList<Post> postsUser = this.getPostsUser(idUser);
    this.listarPosts(postsUser);
  }

  public void listarPostsJogo(String idJogo) {
    ArrayList<Post> postsJogo = this.getPostsJogo(idJogo);
    this.listarPosts(postsJogo);
  }

  public void listarPosts(ArrayList<Post> postsList) {
    for (int i = 0; i < postsList.size(); i++) {
      Post p = postsList.get(i);
      System.out.println("\n");
      System.out.println("LinkImage: " + p.getLinkImage());
      System.out.println("IdPost: " + p.getId());
      System.out.println("IdJogo: "+ p.getIdJogo());
      System.out.println("IdUser: " + p.getIdUser());
      System.out.println("Titulo: " + p.getTitulo());
      System.out.println("Descricao: " + p.getDescricao());
      System.out.println("Link do Discord: " + p.getLinkDiscord());
      System.out.println("\n\n");
    }
  }
}