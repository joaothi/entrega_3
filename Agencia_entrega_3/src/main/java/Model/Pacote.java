package Model;

public class Pacote {
	
	private int idPacote;
	private double preco;
    private String destino;
    private String dataViagem;
    private String hora;
    
    // construtor vazio
    public Pacote() {
    	
    }
    
    //contrutor
    
    public Pacote (double preco, String destino, String dataViagem, String hora) {
    	this.preco = preco;
    	this.destino = destino;
    	this.dataViagem = dataViagem;
    	this.hora = hora;
    }
    
    public Pacote (int idPacote, double preco, String destino, String dataViagem, String hora) {
    	this.idPacote = idPacote;
    	this.preco = preco;
    	this.destino = destino;
    	this.dataViagem = dataViagem;
    	this.hora = hora;
    }

    //geters e seters
	public int getIdPacote() {
		return idPacote;
	}

	public void setIdPacote(int idPacote) {
		this.idPacote = idPacote;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDataViagem() {
		return dataViagem;
	}

	public void setDataViagem(String dataViagem) {
		this.dataViagem = dataViagem;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
    

}
