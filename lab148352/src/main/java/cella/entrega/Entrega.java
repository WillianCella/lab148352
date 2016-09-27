package cella.entrega;

import java.io.Serializable;

public class Entrega implements Serializable {

	private static final long serialVersionUID = 1L;
	private String endereco;
	private int idVenda;

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Entrega [endereco=" + endereco + ", idVenda=" + idVenda + "]";
	}

}
