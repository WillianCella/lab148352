package cella.webservices;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import cella.entrega.Entrega;
import cella.entrega.ProcessEntrega;

@WebService
public class EntregaWs {
	@Inject
	ProcessEntrega pe;

	@WebMethod(operationName = "operacaoEntrega")
	@WebResult(name = "resultadoEntrega")
	public Entrega entrega(@WebParam(name = "enredeco") String endereco) {
		Entrega entrega = new Entrega();
		entrega.setEndereco("Endereço 1");
		// entrega.setVenda();
		pe.processarEntrega(entrega);

		return entrega;
	}

}
