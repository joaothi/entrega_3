package Controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;
import model.Cliente;

@WebServlet(urlPatterns = { "/clientes", "/clientes-create", "/clientes-edit", "/clientes-update", "/clientes-delet" })
public class ClientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ClienteDAO clienteDAO = new ClienteDAO();
	Cliente cliente = new Cliente();

	public ClientesServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		switch (action) {
		case "/clientes":
			read(request, response);
			break;
		case "/clientes-create":
			create(request, response);
			break;
		case "/clientes-edit":
			edit(request, response);
			break;
		case "/clientes-update":
			update(request, response);
			break;
		case "/clientes-delet":
			delet(request, response);
			break;

		default:
			response.sendRedirect("index.html");
			break;
		}
	}

	// ler
	protected void read(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Cliente> lista = clienteDAO.getCliente();

		request.setAttribute("clientes", lista);

		RequestDispatcher rd = request.getRequestDispatcher("agendamento.jsp");
		rd.forward(request, response);
	}

	// criar
	protected void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		cliente.setNome(request.getParameter("nome"));
		cliente.setCidade(request.getParameter("endereco"));
		cliente.setCpf(request.getParameter("cpf"));
		cliente.setCpf(request.getParameter("idade"));
		clienteDAO.save(cliente);
		response.sendRedirect("clientes");

	}

	// leitura por id
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		cliente = clienteDAO.getClienteById(id);

		request.setAttribute("id", cliente.getId());
		request.setAttribute("nome", cliente.getNome());
		request.setAttribute("endereco", cliente.getEndereco());
		request.setAttribute("cpf", cliente.getCpf());
		request.setAttribute("idade", cliente.getIdade());

		RequestDispatcher rd = request.getRequestDispatcher("./agendamento.jsp");
		rd.forward(request, response);

	}

	// atualizar
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		cliente.setId(Integer.parseInt(request.getParameter("id")));
		cliente.setNome(request.getParameter("nome"));
		cliente.setCidade(request.getParameter("endereco"));
		cliente.setCpf(request.getParameter("cpf"));
		cliente.setCidade(request.getParameter("idade"));
		clienteDAO.update(cliente);
		response.sendRedirect("clientes");
	}

	// deletar
	protected void delet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		clienteDAO.deleteById(id);
		response.sendRedirect("clientes");
	}

}
