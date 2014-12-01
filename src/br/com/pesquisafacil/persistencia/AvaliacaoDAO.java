package br.com.pesquisafacil.persistencia;

import br.com.pesquisafacil.modelo.Avaliacao;
import br.com.pesquisafacil.modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/* 
 * @author jSilverize
 */
public class AvaliacaoDAO {

  ConectarBD conexao = new ConectarBD();

  public AvaliacaoDAO(Avaliacao preenchida) {

    gravarAvaliacao(preenchida);

  }

  private void gravarAvaliacao(Avaliacao preenchida) {

    conexao.openConection();
    try {
      PreparedStatement pst = conexao.conn.prepareStatement("INSERT INTO TB_AVALIACAO VALUES (?,?,?,?,?,?,?)");
      pst.setString(1, preenchida.getData());
      pst.setInt(2, preenchida.getNota(0));
      pst.setInt(3, preenchida.getNota(1));
      pst.setInt(4, preenchida.getNota(2));
      pst.setBoolean(5, preenchida.isSimNao());
      pst.setObject(6, preenchida.getComentario());
      conexao.executaSQL("SELECT TOP 1 [ID_CLIENTE] FROM [DB_FACIL].[dbo].[TB_CLIENTE] ORDER BY [ID_CLIENTE] DESC");
      conexao.rs.first();
      pst.setInt(7, conexao.rs.getInt("ID_CLIENTE"));
      pst.executeUpdate();

      System.out.println("Avaliaçao registrada com sucesso.");
    } catch (SQLException ex) {
      System.out.println("Erro ao registrar os dados da avaliação: " + ex);
    }
    conexao.closeConection();
  }

}
