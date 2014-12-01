package br.com.pesquisafacil.persistencia;

import br.com.pesquisafacil.modelo.Avaliacao;
import br.com.pesquisafacil.modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * @author jSilverize
 */ 
public class ClienteDAO {

  ConectarBD conexao = new ConectarBD();

  int idCliente = 0;

  public ClienteDAO(Cliente preenchido) {

    gravarCliente(preenchido);

  }

  private void gravarCliente(Cliente preenchido) {
    conexao.openConection();
    try {
      conexao.executaSQL("SELECT TOP 1 [ID_CLIENTE] FROM [DB_FACIL].[dbo].[TB_CLIENTE] ORDER BY [ID_CLIENTE] DESC");
      conexao.rs.first();
      idCliente = conexao.rs.getInt("ID_CLIENTE") + 1;
      PreparedStatement pst = conexao.conn.prepareStatement("INSERT INTO TB_CLIENTE VALUES (?)");      
      pst.setString(1, preenchido.getEmail());
      pst.executeUpdate();
      System.out.println("Dados do cliente gravados com sucesso.");
    } catch (SQLException ex) {
      System.out.println("Erro ao gravar os dados da cliente: " + ex);
    }
    conexao.closeConection();
  }

  public int getIdCliente() {
    return idCliente;
  }

}
