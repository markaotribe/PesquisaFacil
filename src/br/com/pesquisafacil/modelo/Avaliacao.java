package br.com.pesquisafacil.modelo;

/*
 * @author jsilverize
 */
public class Avaliacao { 

  private int[] nota;
  private boolean simNao;
  private String comentario;
  private String data;
  
  public Avaliacao(int numeroPerguntas) {
    nota = new int [numeroPerguntas];
  }

  public int getNota(int pos) {
    return nota[pos];
  }

  public void setNota(int pos, int nota) {
    this.nota[pos] = nota;
  }

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public boolean isSimNao() {
    return simNao;
  }

  public void setSimNao(boolean simNao) {
    this.simNao = simNao;
  }

}
