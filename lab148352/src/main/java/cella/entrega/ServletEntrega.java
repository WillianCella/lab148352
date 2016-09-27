package cella.entrega;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Willian Cella
 */

import java.io.Serializable;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/entrega")
public class ServletEntrega extends HttpServlet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	ProcessEntrega pe;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		for (int i = 0; i < 3; i++) {
			Entrega ent = new Entrega();
			ent.setEndereco("Rua dos gnomos numero zero");
			ent.setIdVenda(i);
			writer.write("Entrega...");
			pe.processarEntrega(ent);
			writer.write("Entrega " + i + "concluída!");
		}
	}
}
