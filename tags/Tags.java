package tags;

import java.util.ArrayList;

public class Tags {
  private ArrayList<String> tags = new ArrayList<String>();

  public void addTag(String tag) {
    this.tags.add(tag);
  }

  public void removerTag(String tag) {
    for (int i = 0; i < this.tags.size(); i++) {
      String t = this.tags.get(i);
      if (t == tag) {
        this.tags.remove(i);
        return;
      }
    }
  }

  public void listarTags() {
    for (int i = 0; i < this.tags.size(); i++) {
      System.out.println(this.tags.get(i));
    }
  }
}