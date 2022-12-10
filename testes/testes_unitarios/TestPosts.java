package testes.testes_unitarios;
import posts.*;

public class TestPosts extends Test implements Tests {
  public void test() {
      Posts posts = new Posts();
      String urlImage = "ksdkdks";
      String idJogo = "3445466";
      String idUser = "238283724";
      String titulo = "quero jogar";
      String descricao = "porfavor !!!!! apareca rapido";
      String linkDiscord = "92388382";
    
      String idNewPost = posts.criarPost(urlImage, idJogo, idUser, titulo, descricao, linkDiscord);
    
      Post post = posts.getPost(idNewPost);
      String urlImageResultado = post.getLinkImage();
      String idJogoResultado = post.getIdJogo();
      String idUserResultado = post.getIdUser();
      String tituloResultado = post.getTitulo();
      String descricaoResultado = post.getDescricao();
      String linkDiscordResultado = post.getLinkDiscord();
      String idResultado = post.getId();

      assertEquals(urlImage, urlImageResultado);
      assertEquals(idJogo, idJogoResultado);
      assertEquals(idUser, idUserResultado);
      assertEquals(titulo, tituloResultado);
      assertEquals(descricao, descricaoResultado);
      assertEquals(linkDiscord, linkDiscordResultado);
      assertEquals(idNewPost, idResultado);
    
      boolean apagarResultado = posts.apagarPost(idNewPost);
      assertEquals(true, apagarResultado);

      this.resultado("TestPosts");
  }
}