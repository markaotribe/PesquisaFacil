package br.com.pesquisafacil.modelo;

/*
 * @author jsilverize
 */
public class Cliente { 
  
  private int id;
  private String email;

  public Cliente(String email) {
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
