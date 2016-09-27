package cella.mdbs;

import java.util.Date;

import javax.ejb.EJB;
import cella.DAO.LogDao;
import cella.entidades.Log;

public abstract class AbstractMDB {
	@EJB
	LogDao dao;

	public void salvarLog(String mdbNome, Date data, String msg) {
		Log log = new Log(mdbNome, data, msg);
		dao.create(log);
	}
}
