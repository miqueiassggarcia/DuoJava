package testes.testes_unitarios;

public class Test {
  private int resultados_ruins = 0;
  
  public void assertEquals(String expected, String actual) {
    if (expected != actual) {
      this.resultados_ruins += 1;
    }
  }

  public void assertEquals(boolean expected, boolean actual) {
    if (expected != actual) {
      this.resultados_ruins += 1;
    }
  }

  public void assertEquals(int expected, int actual) {
    if (expected != actual) {
      this.resultados_ruins += 1;
    }
  }

  public void resultado(String className) {
    if (this.resultados_ruins == 0) {
      System.out.println(className + " passou");
    } else {
      System.out.println(className + " fracassou");
    }
  }
}

