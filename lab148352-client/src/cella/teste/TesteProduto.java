package cella.teste;

import java.math.BigDecimal;

import br.cella.wsclient.produto.ProdutoWs;
import br.cella.wsclient.produto.ProdutoWsService;

public class TesteProduto {
	public static void main(String[] args) {
		ProdutoWsService service = new ProdutoWsService();
		ProdutoWs port = service.getProdutoWsPort();
		port.salvar("123445", new BigDecimal("120"), "produto1");
		port.buscar(new Long(1));
		port.atualziar(new Long(1), "634234", new BigDecimal("100"), "produto1");
		port.deletar(new Long(1));
	}

}
