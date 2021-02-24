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
	
	private Byte[] percorsoFile;
	
	@ManyToOne
	private Post post;
	
	
	

	public Integer getIdImmagine() {
		return idImmagine;
	}

	public void setIdImmagine(Integer idImmagine) {
		this.idImmagine = idImmagine;
	}

	public Byte[] getPercorsoFile() {
		return percorsoFile;
	}

	public void setPercorsoFile(Byte[] percorsoFile) {
		this.percorsoFile = percorsoFile;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}
