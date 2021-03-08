package it.rizzoli.ifts.progettoescursioni01.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Percorso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPercorso;
	//aggiungere tragitto(?)

	public Integer getIdPercorso() {
		return idPercorso;
	}

	public void setIdPercorso(Integer idPercorso) {
		this.idPercorso = idPercorso;
	}

}
