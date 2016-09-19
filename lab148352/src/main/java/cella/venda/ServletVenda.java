package cella.venda;

import java.io.IOException;

/**
 * author Willian Cella
 */

import java.io.Serializable;
import java.math.BigDecimal;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/venda")
public class ServletVenda extends HttpServlet implements Serializable {
	private static final long serialVersionUID = 1L;
	@Inject
	ProcessVenda pv;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Venda venda = new Venda();
		venda.setId(1);
		venda.setDescricao("primeiro");
		venda.setValor(new BigDecimal("10"));
		
		pv.processarVenda(venda);
	}
}
