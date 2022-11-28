package usuarios;

public interface UsuariosBuilder {
  void setName(String name);
  void setSexo(String sexo);
  void setEmail(String email);
  void setHashSenha(String hashSenha);
  void setLinkFoto(String lf);
  void reset();
}