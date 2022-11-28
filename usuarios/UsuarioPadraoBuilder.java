package usuarios;

public class UsuarioPadraoBuilder implements UsuariosBuilder {
  private String name;
  private String sexo;
  private String email;
  private String hashSenha;
  private String linkFoto;
  
  public void setName(String name) { this.name = name; }
  public void setSexo(String sexo) { this.sexo = sexo; }
  public void setEmail(String email) { this.email = email; }
  public void setHashSenha(String hashSenha) { this.hashSenha = hashSenha; }
  public void setLinkFoto(String lf) { this.linkFoto = lf; }
  public void reset() {
    this.name = "";
    this.sexo = "";
    this.email = "";
    this.hashSenha = "";
    this.linkFoto = "";
  }

  public UsuarioPadrao getUser() {
    return new UsuarioPadrao(this.name, this.sexo, this.email, this.hashSenha, this.linkFoto);
  }
}