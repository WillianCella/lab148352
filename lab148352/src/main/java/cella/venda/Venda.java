package cella.venda;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Venda implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String descricao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public ArrayList<Venda> getListaVenda() {
		return listaVenda;
	}

	public void setListaVenda(ArrayList<Venda> listaVenda) {
		this.listaVenda = listaVenda;
	}

	private BigDecimal valor;
	ArrayList<Venda> listaVenda = new ArrayList<>();
}
