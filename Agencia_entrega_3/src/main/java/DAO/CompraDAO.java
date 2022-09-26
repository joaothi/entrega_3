import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CompraDAO {
	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Compra Compra) {

		// Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
		// de dados

		String sql = "INSERT INTO Compra(Valor,Data)" + " VALUES(?,?)";

		try {
			// Cria uma conexão com o banco
			conn = Conexao.createConnectionToMySQL();

			// Cria um PreparedStatment, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			
			// Adicionar o valor do primeiro parâmetro da sql
			pstm.setDouble(1, Compra.getValor());
			// Adiciona o valor do segundo parâmetro da sql
			pstm.setDate(2, new Date(Compra.getData().getTime()));

			// Executa a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fecha as conexões
			try {
				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	public void removeByidCompra(int idCompra) {

		String sql = "DELETE FROM contato WHERE idCompra = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql); // erro aqui
			pstm.setInt(1, idCompra);
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fecha as conexões
			try {
				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	public void update(Compra Compra) {

		String sql = "UPDATE Compra SET Valor = ?; Data = ?" + "WHERE idCompra = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setDouble(1, Compra.getValor());
			pstm.setDate(2, new Date(Compra.getData().getTime()));
			pstm.setInt(3, Compra.getIdCompra());

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fecha as conexões
			try {
				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	public List<Compra> getCompra() {

		String sql = "SELECT * FROM Compra";

		List<Compra> Compra = new ArrayList<Compra>();

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			// Enquanto existir dados no banco de dados, faça
			while (rset.next()) {

				Compra Compra1 = new Compra();

				// Recupera o id do banco e atribui ele ao objeto
				Compra1.setIdCompra(rset.getInt("idCompra"));

			

				// Recupera a idade do banco e atribui ele ao objeto
				Compra1.setValor(rset.getDouble("Valor"));

				// Recupera a data do banco e atribui ela ao objeto
				Compra1.setData(rset.getDate("Data"));

				// Adiciono o contato recuperado, a lista de contatos
				Compra1.add(Compra);
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {

				if (rset != null) {

					rset.close();
				}

				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		return Compra;
	}
}