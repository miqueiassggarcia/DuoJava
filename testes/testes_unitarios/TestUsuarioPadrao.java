package testes.testes_unitarios;
import usuarios.*;

public class TestUsuarioPadrao extends Test implements Tests {
  public void test() {
      UsuarioPadraoBuilder upb = new UsuarioPadraoBuilder();
      String nome = "Fábio";
      String email = "seila@gmail.com";
      String hashSenha = "2392932kedk92923";
      String sexo = "M";
      String linkFoto = "skddkk";
      
      upb.setName(nome);
      upb.setEmail(email);
      upb.setHashSenha(hashSenha);
      upb.setSexo(sexo);
      upb.setLinkFoto(linkFoto);
    
      UsuarioPadrao up = upb.getUser();
      String nomeResultado = up.getName();
      String emailResultado = up.getEmail();
      String sexoResultado = up.getSexo();
      String linkFotoResultado = up.getLinkFoto();
      boolean adminResultado = up.getAdmin();
      upb.reset();
    
      assertEquals(nome, nomeResultado);
      assertEquals(email, emailResultado);
      assertEquals(sexo, sexoResultado);
      assertEquals(linkFoto, linkFotoResultado);
      assertEquals(false, adminResultado);

      this.resultado("TestUsuarioPadrao");
  }
}