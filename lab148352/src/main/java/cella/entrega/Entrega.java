package cella.entrega;

import java.io.Serializable;

import cella.venda.Venda;

public class Entrega implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String endereco;
	private Venda venda;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	
}


