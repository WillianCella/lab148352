package cella.venda;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Venda implements Serializable {
	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricao=" + descricao + ", listaVenda=" + listaVenda + ", valor=" + valor + "]";
	}

	private static final long serialVersionUID = 1L;
	private int id;
	private String descricao;
	ArrayList<String> listaVenda = new ArrayList<>();

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

	private BigDecimal valor;

	public ArrayList<String> getListaVenda() {
		return listaVenda;
	}

	public void setListaVenda(ArrayList<String> listaVenda) {
		this.listaVenda = listaVenda;
	}

}
