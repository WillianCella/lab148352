package cella.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import cella.entidades.Produto;

/**
 * DAO for Produto
 */
@Stateless
public class ProdutoDao {
	@PersistenceContext(unitName = "lab148352-persistence-unit")
	private EntityManager em;

	public void create(Produto entity) {
		em.persist(entity);
	}

	public void deleteById(Long id) {
		Produto entity = em.find(Produto.class, id);
		if (entity != null) {
			em.remove(entity);
		}
	}

	public Produto findById(Long id) {
		return em.find(Produto.class, id);
	}

	public Produto update(Produto entity) {
		return em.merge(entity);
	}

	public List<Produto> listAll(Integer startPosition, Integer maxResult) {
		TypedQuery<Produto> findAllQuery = em
				.createQuery("SELECT DISTINCT p FROM Produto p ORDER BY p.id",
						Produto.class);
		if (startPosition != null) {
			findAllQuery.setFirstResult(startPosition);
		}
		if (maxResult != null) {
			findAllQuery.setMaxResults(maxResult);
		}
		return findAllQuery.getResultList();
	}
}
