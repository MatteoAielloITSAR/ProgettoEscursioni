package it.rizzoli.ifts.progettoescursioni01.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//probabile relazione Uno a Molti (da mettere su Utente)
@Entity
public class Iscrizione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idIscrizione;

	public Integer getIdIscrizione() {
		return idIscrizione;
	}

	public void setIdIscrizione(Integer idIscrizione) {
		this.idIscrizione = idIscrizione;
	}
	
	//private Utente creatore;
	//private Utente iscritto;

}
