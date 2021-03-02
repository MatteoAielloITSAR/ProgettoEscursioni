package it.rizzoli.ifts.progettoescursioni01.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Attrezzatura {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer idImmagine;
	//aggiungere percorso_file(?)
	
	@Column(nullable = false)  
	private String nome;
	
	
	@JsonIgnore
	@ManyToMany(mappedBy = "attrezzature")
	private List<Post> post;

	public Integer getIdImmagine() {
		return idImmagine;
	}

	public void setIdImmagine(Integer idImmagine) {
		this.idImmagine = idImmagine;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}
}
