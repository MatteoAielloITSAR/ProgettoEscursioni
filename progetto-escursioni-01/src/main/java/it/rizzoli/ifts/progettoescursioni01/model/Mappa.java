package it.rizzoli.ifts.progettoescursioni01.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mappa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMappa;

	public Integer getIdMappa() {
		return idMappa;
	}

	public void setIdMappa(Integer idMappa) {
		this.idMappa = idMappa;
	}

}
