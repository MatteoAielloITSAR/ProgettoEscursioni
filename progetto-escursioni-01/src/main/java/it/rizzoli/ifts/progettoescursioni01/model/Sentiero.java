package it.rizzoli.ifts.progettoescursioni01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sentiero {
	
	@Id
	private Integer idSentiero;
	
	@Column(nullable = false, length = 50)
	private String nomeSentiero;

	public Integer getIdSentiero() {
		return idSentiero;
	}

	public void setIdSentiero(Integer idSentiero) {
		this.idSentiero = idSentiero;
	}

	public String getNomeSentiero() {
		return nomeSentiero;
	}

	public void setNomeSentiero(String nomeSentiero) {
		this.nomeSentiero = nomeSentiero;
	}

	@Override
	public String toString() {
		return "Sentiero [idSentiero=" + idSentiero + ", nomeSentiero=" + nomeSentiero + "]";
	}

}
