package cella.entrega;

import java.io.IOException;

/**
 * @author Willian Cella
 */

import java.io.Serializable;
import java.math.BigDecimal;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cella.venda.ProcessVenda;
import cella.venda.Venda;

@WebServlet("/entrega")
public class ServletEntrega extends HttpServlet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.getWriter().println("Realizando a entrega");

		// Entrega entrega = new Entrega();
		//
		// entrega.setEndereco("Rua dos bobos numero zero");
		// Venda v = new Venda();
		// v.setId(123);
		// v.setDescricao("Rolas Voadoras");
		// entrega.setVenda(v);
		//
		// pe.processarEntrega(entrega);
	}
}
