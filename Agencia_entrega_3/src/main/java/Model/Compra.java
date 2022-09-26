package Model;

import java.util.Date;

public class Compra {

	private int idCompra;
	private double valor;
    private Date dataCompra;
    
 // construtor vazio
    public Compra() {
    	
    }
    
 // construtor
    
    public Compra (double valor, Date dataCompra) {
    	this.valor = valor;
    	this.dataCompra = dataCompra;
    	
    }
    
    public Compra (int idCompra, double valor, Date dataCompra) {
    	this.idCompra = idCompra;
    	this.valor = valor;
    	this.dataCompra = dataCompra;	
    }

 // geters e seters
    
	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
    
 
    
	
	
}
