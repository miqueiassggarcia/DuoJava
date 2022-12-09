package usuarios;

import java.util.UUID;
import notificacoes.*;
import tags.*;
import usuarios_favoritos.*;
import jogos.*;

abstract class Usuario {
  protected String name;
  protected String sexo;
  protected String email;
  protected String hashSenha;
  protected String linkFoto;
  protected boolean admin;
  protected String id;
  public Notificacoes notificacoes;
  public Tags tags;
  public UsuariosFavoritos usuariosFavoritos;
  public JogosFavoritos jogosFavoritos;

  public Usuario(String name, String sexo, String email, String hashSenha, String linkFoto, boolean admin) {
    this.name = name;
    this.sexo = sexo;
    this.email = email;
    this.hashSenha = hashSenha;
    this.linkFoto = linkFoto;
    this.admin = admin;
    this.id = UUID.randomUUID().toString();
    this.notificacoes = new Notificacoes();
    this.tags = new Tags();
    this.usuariosFavoritos = new UsuariosFavoritos();
    this.jogosFavoritos = new JogosFavoritos();
  }
  
  public void excluirConta() {
    /* 
      Caso existisse um banco de dados nesta aplicação,
      Aqui seria onde excluiriamos a conta do banco
    */
    System.out.println("Conta excluida do banco de dados!!");
  }

  public String getName() { return this.name; }
  public String getSexo() { return this.sexo; }
  public String getEmail() { return this.email; }
  public String getLinkFoto() { return this.linkFoto; }
  public boolean getAdmin() { return this.admin; }
  public String getId() { return this.id; }
  public String getHash() { return this.hashSenha; }

  public void setName(String newName) { this.name = newName; }
  public void setSexo(String ns) { this.sexo = ns; }
  public void setEmail(String ne) { this.email = ne; }
  public void setlinkFoto(String nf) { this.linkFoto = nf; }
} 