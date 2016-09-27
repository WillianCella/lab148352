package cella.entidades;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "log")
public class Log implements Serializable {
	public Log(String ejbname, Date date, String msgrecebida) {
		super();
		this.ejbname = ejbname;
		this.date = date;
		this.msgrecebida = msgrecebida;
	}

	public Log() {
		
	}

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@Column
	private String ejbname;

	@Column
	@Temporal(TemporalType.DATE)
	private Date date;

	@Column
	private String msgrecebida;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Log)) {
			return false;
		}
		Log other = (Log) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public String getEjbname() {
		return ejbname;
	}

	public void setEjbname(String ejbname) {
		this.ejbname = ejbname;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMsgrecebida() {
		return msgrecebida;
	}

	public void setMsgrecebida(String msgrecebida) {
		this.msgrecebida = msgrecebida;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (ejbname != null && !ejbname.trim().isEmpty())
			result += "ejbname: " + ejbname;
		if (msgrecebida != null && !msgrecebida.trim().isEmpty())
			result += ", msgrecebida: " + msgrecebida;
		return result;
	}
}