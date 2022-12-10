package testes.testes_unitarios;
import usuarios.*;

public class TestUsuarioAdmin extends Test implements Tests {
  public void test(){
    UsuarioAdminBuilder uab = new UsuarioAdminBuilder();
    String nome = "Fábio";
    String email = "seila@gmail.com";
    String hashSenha = "2392932kedk92923";
    String sexo = "M";
    String linkFoto = "skddkk";
    
    uab.setName(nome);
    uab.setEmail(email);
    uab.setHashSenha(hashSenha);
    uab.setSexo(sexo);
    uab.setLinkFoto(linkFoto);
  
    UsuarioAdmin ua = uab.getUser();
    String nomeResultado = ua.getName();
    String emailResultado = ua.getEmail();
    String sexoResultado = ua.getSexo();
    String linkFotoResultado = ua.getLinkFoto();
    boolean adminResultado = ua.getAdmin();
    uab.reset();
  
    assertEquals(nome, nomeResultado);
    assertEquals(email, emailResultado);
    assertEquals(sexo, sexoResultado);
    assertEquals(linkFoto, linkFotoResultado);
    assertEquals(true, adminResultado);

    this.resultado("TestUsuarioAdmin");
  }
}