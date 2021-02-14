package it.rizzoli.ifts.progettoescursioni01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPost;
	
	@Column(nullable = false, length = 50)
	private String nome_percorso;
	
	@Column(length = 500)
	private String descrizione;
	
	@Column(length = 10)
	private Integer difficolta;
	
	@Column(nullable = false, length = 10)
	private String visibilita;
	
	@Column(nullable = false, length = 20)
	private String tipologiaPercorso;

	public Integer getIdPost() {
		return idPost;
	}

	public void setIdPost(Integer idPost) {
		this.idPost = idPost;
	}

	public String getNome_percorso() {
		return nome_percorso;
	}

	public void setNome_percorso(String nome_percorso) {
		this.nome_percorso = nome_percorso;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Integer getDifficolta() {
		return difficolta;
	}

	public void setDifficolta(Integer difficolta) {
		this.difficolta = difficolta;
	}

	public String getVisibilita() {
		return visibilita;
	}

	public void setVisibilita(String visibilita) {
		this.visibilita = visibilita;
	}

	public String getTipologiaPercorso() {
		return tipologiaPercorso;
	}

	public void setTipologiaPercorso(String tipologiaPercorso) {
		this.tipologiaPercorso = tipologiaPercorso;
	}

	@Override
	public String toString() {
		return "Post [idPost=" + idPost + ", nome_percorso=" + nome_percorso + ", descrizione=" + descrizione
				+ ", difficolta=" + difficolta + ", visibilita=" + visibilita + ", tipologiaPercorso="
				+ tipologiaPercorso + "]";
	}

}