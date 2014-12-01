package br.com.pesquisafacil.modelo;

/*
 * @author jsilverize
 */
public class Pergunta {
 
  private int id;
  private String enunciado;
  private String textoAjuda;

  public Pergunta(int id, String enunciado, String textoAjuda) {
    this.id = id;
    this.enunciado = enunciado;
    this.textoAjuda = textoAjuda;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEnunciado() {
    return enunciado;
  }

  public void setEnunciado(String enunciado) {
    this.enunciado = enunciado;
  }

  public String getTextoAjuda() {
    return textoAjuda;
  }

  public void setTextoAjuda(String textoAjuda) {
    this.textoAjuda = textoAjuda;
  }

}
