import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PacoteDAO {
	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Pacote Pacote) {

		// Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
		// de dados

		String sql = "INSERT INTO Pacote(Data_Viagem,Preco,Hora)" + " VALUES(?,?,?)";

		try {
			// Cria uma conexão com o banco
			conn = Conexao.createConnectionToMySQL();

			// Cria um PreparedStatment, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adiciona o valor do primeiro parâmetro da sql
			pstm.setString(1, Pacote.getData_Viagem());
			// Adicionar o valor do segundo parâmetro da sql
			pstm.setDouble(2, Pacote.getPreco());
			// Adiciona o valor do terceiro parâmetro da sql
			pstm.setString(3, Pacote.getHora());
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

	public void removeByidPacote(int idPacote) {

		String sql = "DELETE FROM contato WHERE idPacote = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql); // erro aqui
			pstm.setInt(1, idPacote);
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

	public void update(Pacote Pacote) {

		String sql = "UPDATE contato SET Data_Viagem = ?, Preco = ?; Hora = ?" + "WHERE idPacote = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, Pacote.getData_Viagem());
			pstm.setDouble(2, Pacote.getPreco());
			pstm.setString(3, Pacote.getHora());

			pstm.setInt(4, Pacote.getIdPacote());

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

	public List<Pacote> getPacote() {

		String sql = "SELECT * FROM Pacote";

		List<Pacote> Pacote = new ArrayList<Pacote>();

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			// Enquanto existir dados no banco de dados, faça
			while (rset.next()) {

				Pacote Pacote1 = new Pacote();

				// Recupera o id do banco e atribui ele ao objeto
				Pacote1.setIdPacote(rset.getInt("idPacote"));

				// Recupera o nome do banco e atribui ele ao objeto
				Pacote1.setData_Viagem(rset.getString("Data_Viagem"));

				// Recupera a idade do banco e atribui ele ao objeto
				Pacote1.setPreco(rset.getDouble("Preco"));

				// Recupera a data do banco e atribui ela ao objeto
				Pacote1.setHora(rset.getString("Hora"));

				// Adiciono o contato recuperado, a lista de contatos
				Pacote1.add(Pacote);
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

		return Pacote;
	}
}