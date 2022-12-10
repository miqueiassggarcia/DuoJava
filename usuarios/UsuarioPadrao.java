package usuarios;

public class UsuarioPadrao extends Usuario {

  public UsuarioPadrao(String name, String sexo, String email, String hashSenha, String linkFoto) {
    super(name, sexo, email, hashSenha, linkFoto, false);
  }
}