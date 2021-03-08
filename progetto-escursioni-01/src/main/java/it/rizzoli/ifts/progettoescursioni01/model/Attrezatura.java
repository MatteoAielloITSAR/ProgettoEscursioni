package it.rizzoli.ifts.progettoescursioni01.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Attrezatura {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer idImmagine;
	//aggiungere percorso_file(?)
	
	private String nome;
	
	@OneToMany
	private List<Post> post;
}
