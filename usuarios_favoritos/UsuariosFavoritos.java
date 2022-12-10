package usuarios_favoritos;

import java.util.ArrayList;

public class UsuariosFavoritos {
  private ArrayList<String> usuariosFavoritos = new ArrayList<String>();

  public void addUsuarioFavorito(String ufId) {
    this.usuariosFavoritos.add(ufId);
  }

  public void removerUsuarioFavorito(String ufId) {
    for (int i = 0; i < this.usuariosFavoritos.size(); i++) {
      if (this.usuariosFavoritos.get(i) == ufId) {
        this.usuariosFavoritos.remove(i);
        return;
      }
    }
  }

  public void listarUsuariosFavoritos() {
    for (int i = 0; i < this.usuariosFavoritos.size(); i++) {
      System.out.println(this.usuariosFavoritos.get(i));
    }
  }
}