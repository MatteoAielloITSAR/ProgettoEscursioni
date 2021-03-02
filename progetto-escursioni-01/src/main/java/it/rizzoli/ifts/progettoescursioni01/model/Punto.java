package it.rizzoli.ifts.progettoescursioni01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Punto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPunto;
	
	@Column(nullable = false)
	private Double latitudine;
	
	@Column(nullable = false)
	private Double longitudine;
	
	@Column(nullable = false)
	private Boolean poi;
	
	@Column(nullable = true)
	private String nome;
	
	@Column(nullable = false)
	private Integer ordine;
	
	@JsonIgnore
	@ManyToOne
	@Column(nullable = false)
	private Post post;

	public Integer getIdPunto() {
		return idPunto;
	}

	public void setIdPunto(Integer idPunto) {
		this.idPunto = idPunto;
	}

	public Double getLatitudine() {
		return latitudine;
	}

	public void setLatitudine(Double latitudine) {
		this.latitudine = latitudine;
	}

	public Double getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(Double longitudine) {
		this.longitudine = longitudine;
	}

	public Boolean getPoi() {
		return poi;
	}

	public void setPoi(Boolean poi) {
		this.poi = poi;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getOrdine() {
		return ordine;
	}

	public void setOrdine(Integer ordine) {
		this.ordine = ordine;
	}

}
