package it.rizzoli.ifts.progettoescursioni01.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Immagine {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer idImmagine;
	//aggiungere percorso_file(?)
	
	private String percorsoFile;
	
	@ManyToOne
	private Post post;

}
