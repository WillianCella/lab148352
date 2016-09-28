package cella.webservices;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
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
	public Venda vender(@WebParam(name = "id") int id, @WebParam(name = "descricao") String descricao,
			@WebParam(name = "valor") BigDecimal valor, @WebParam(name = "lista") ArrayList list) {
		Venda venda = new Venda();
		ArrayList<String> lista = new ArrayList<>();
		// venda.setListaVenda(lista);
		venda.setId(1);
		venda.setDescricao("Teste");
		venda.setValor(new BigDecimal("5"));
		lista.add("produto 1");
		lista.add("produto 2");
		lista.add("produto 3");
		venda.setListaVenda(lista);
		pv.processarVenda(venda);
		return venda;
	}
}
