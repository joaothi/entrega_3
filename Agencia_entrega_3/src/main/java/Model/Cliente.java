package Model;

public class Cliente {
	
	private int idCliente;
	private int cpf;
    private String nome;
    private String idade;
    
    // construtor vazio
    public Cliente() {
    	
    }
    // construtor
    public Cliente (int cpf, String nome, String idade) {
    	this.cpf = cpf;
    	this.nome = nome;
    	this.idade = idade;
    }

    public Cliente (int idCliente, int cpf, String nome, String idade) {
    	this.idCliente = idCliente;
    	this.cpf = cpf;
    	this.nome = nome;
    	this.idade = idade;
    }

    // geters e seters
    
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
    
    
}
