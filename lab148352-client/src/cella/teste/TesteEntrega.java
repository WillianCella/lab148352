package cella.teste;

import br.cella.wsclient.entrega.EntregaWs;
import br.cella.wsclient.entrega.EntregaWsService;

public class TesteEntrega {
	public static void main(String[] args) {
		EntregaWsService service = new EntregaWsService();
		EntregaWs port = service.getEntregaWsPort();
		port.operacaoEntrega("Rua das divas");
	}
}