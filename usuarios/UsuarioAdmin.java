package usuarios;

public class UsuarioAdmin extends Usuario {
  public UsuarioAdmin(String name, String sexo, String email, String hashSenha, String linkFoto) {
    super(name, sexo, email, hashSenha, linkFoto, true);
  }
}