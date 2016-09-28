package cella.teste;

import java.math.BigDecimal;
import java.util.ArrayList;

import br.cella.wsclient.venda.VendaWs;
import br.cella.wsclient.venda.VendaWsService;

public class TesteVenda {
	public static void main(String[] args) {
		VendaWsService service = new VendaWsService();
		VendaWs port = service.getVendaWsPort();
		port.operacaoVenda(1, "xablau", new BigDecimal("4"), new ArrayList<Object>());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
