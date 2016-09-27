package cella.webservices;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import cella.venda.ProcessVenda;
import cella.venda.Venda;

@WebService
public class VendaWs {
	@Inject
	ProcessVenda pv;

	@WebMethod(operationName = "operacaoVenda")
	@WebResult(name = "resultadoVenda")
	public Venda vender() {
		Venda venda = new Venda();
		ArrayList<Venda> lista = new ArrayList<>();
		//venda.setListaVenda(lista);
		venda.setId(1);
		venda.setDescricao("Teste");
		venda.setValor(new BigDecimal("5"));
		lista.add(venda);
		return venda;
	}
}
