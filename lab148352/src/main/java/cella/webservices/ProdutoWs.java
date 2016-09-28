package cella.webservices;

import java.math.BigDecimal;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import cella.DAO.ProdutoDao;
import cella.entidades.Produto;

@WebService
public class ProdutoWs {
	@EJB
	ProdutoDao dao;

	@WebMethod(operationName = "salvar")
	@WebResult(name = "resultadosalvar")
	public void salvar(@WebParam(name = "codBarras") String codbarras, @WebParam(name = "preco") BigDecimal preco,
			@WebParam(name = "descricao") String descricao) {
		Produto prod = new Produto();
		dao.create(prod);
	}

	@WebMethod(operationName = "buscar")
	@WebResult(name = "resultadobuscar")
	public Produto buscar(@WebParam(name = "id") Long id) {
		Produto prod = dao.findById(id);
		return prod;
	}

	@WebMethod(operationName = "atualziar")
	@WebResult(name = "resultadoatualizar")
	public void atualizar(@WebParam(name = "id") Long id, @WebParam(name = "codBarras") String codbarras,
			@WebParam(name = "preco") BigDecimal preco, @WebParam(name = "descricao") String descricao) {
		Produto prod = new Produto();
		dao.update(prod);
	}

	@WebMethod(operationName = "deletar")
	@WebResult(name = "resultadodeletar")
	public void deletar(Long id) {
		dao.deleteById(id);
	}
}
