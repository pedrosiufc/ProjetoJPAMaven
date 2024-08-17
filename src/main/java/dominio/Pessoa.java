package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idInteger;
	private String nomeString;
	private String emailString;

	public Pessoa() {

	}

	public Pessoa(Integer idInteger, String nomeString, String emaString) {

		this.idInteger = idInteger;
		this.nomeString = nomeString;
		this.emailString = emaString;
	}

	public Integer getIdInteger() {
		return idInteger;
	}

	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}

	public String getNomeString() {
		return nomeString;
	}

	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}

	public String getEmailString() {
		return emailString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	@Override
	public String toString() {
		return "Pessoa [idInteger=" + idInteger + ", nomeString=" + nomeString + ", emailString=" + emailString + "]";
	}

}
