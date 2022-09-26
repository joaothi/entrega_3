import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Cliente Cliente) {

		// Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
		// de dados

		String sql = "INSERT INTO Cliente(Nome,Idade,Cpf,Endereco)" + " VALUES(?,?,?,?)";

		try {
			// Cria uma conexão com o banco
			conn = Conexao.createConnectionToMySQL();

			// Cria um PreparedStatment, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adiciona o valor do primeiro parâmetro da sql
			pstm.setString(1, Cliente.getNome());
			
			// Adicionar o valor do segundo parâmetro da sql
			pstm.setInt(2, Cliente.getIdade());
			
			// Adiciona o valor do terceiro parâmetro da sql
		    pstm.setString(3, Cliente.getCpf());
						
		    // Adiciona o valor do quarto parâmetro da sql
	        pstm.setString(4, Cliente.getEndereco());			
	 		

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

	public void removeByidCliente(int idCliente) {

		String sql = "DELETE FROM contato WHERE idCliente = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql); // erro aqui
			pstm.setInt(1, idCliente);
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

	public void update(Cliente Cliente) {

		String sql = "UPDATE contato SET Nome = ?, Idade = ?; Cpf = ?, Endereco = ?" + "WHERE idCliente = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, Cliente.getNome());
			pstm.setInt(2, Cliente.getIdade());
			pstm.setString(3, Cliente.getCpf());
			pstm.setString(4, Cliente.getEndereco());
			pstm.setInt(5, Cliente.getIdCliente());

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

	public List<Cliente> getCLiente() {

		String sql = "SELECT * FROM Cliente";

		List<Cliente> Cliente = new ArrayList<Cliente>();

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			// Enquanto existir dados no banco de dados, faça
			while (rset.next()) {

				Cliente Cliente1 = new Cliente();

				// Recupera o id do banco e atribui ele ao objeto
				Cliente1.setIdCliente(rset.getInt("idCliente"));

				// Recupera o nome do banco e atribui ele ao objeto
				Cliente1.setNome(rset.getString("Nome"));

				// Recupera a idade do banco e atribui ele ao objeto
				Cliente1.setIdade(rset.getInt("Idade"));

				// Recupera o cpf do banco e atribui ele ao objeto
				Cliente1.setCpf(rset.getString("Cpf"));

				// Adiciona o cliente recuperado, a lista de contatos
			    Cliente.add(Cliente1);
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

		return Cliente;
	}
}