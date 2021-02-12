package it.rizzoli.ifts.progettoescursioni01.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Punto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPunto;
	//aggiungere punto(?)

	public Integer getIdPunto() {
		return idPunto;
	}

	public void setIdPunto(Integer idPunto) {
		this.idPunto = idPunto;
	}

}
