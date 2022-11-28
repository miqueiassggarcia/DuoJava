import objects.Jogos;
import objects.Notificacoes;
import objects.Tags;

public class Usuario {
  private String nome;
  private String sexo;
  private String email;
  private String urlImagem;
  private Notificacoes notificacoes;
  private Tags tags;
  private Jogos jogos;

  Usuario(String nome, String sexo, String email) {
    this.nome = nome;
    this.sexo = sexo;
    this.email = email;
    this.urlImagem = "";
    this.notificacoes = new Notificacoes();
    this.tags = new Tags();
    this.jogos = new Jogos();
  }

  //private String verificarLogin(String email, String senha) {
    //hash: string = "query no banco de dados";
    //return senha.encrypt() = hash;
  //}

  //public boolean criarNovoUsuario(String senha) {
    //queryNoBando(email, senha)
  //}
  
  //public boolean adicionarDadosUsuario() {
    //queryNoBando("dados do objeto");
  //}
  
  public String getnome() {
    return this.nome;
  }
  
  public String getsexo() {
    return this.sexo;
  }
  
  public String getemail() {
    return this.email;
  }
  
  public String geturlImage() {
    return this.urlImagem;
  }

  public void setnome(String nome) {
    this.nome = nome;
  }
  
  public void setsexo(String sexo) {
    this.sexo = sexo;
  }
  
  public void setemail(String email) {
    this.email = email;
  }
  
  public void seturlImage(String urlImagem) {
    this.urlImagem = urlImagem;
  }
}