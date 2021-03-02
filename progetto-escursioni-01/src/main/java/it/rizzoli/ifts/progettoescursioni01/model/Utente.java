package it.rizzoli.ifts.progettoescursioni01.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Utente {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer idUtente;
	
	@Column(length = 20)
	private String username;
	
	@Column(nullable = false, length = 20)
	private String nome;
	
	@Column(nullable = false, length = 20)
	private String cognome;
	
	@Column(nullable = false, length = 20)
	private String password;
	
	@ManyToMany(mappedBy = "iscritti" )
	private List<Utente> iscrizioni;
	
	@JsonIgnore
	@ManyToMany()
	private List<Utente> iscritti;
	
	@OneToMany(mappedBy = "utente")
	private List<Post> post;
	
	

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Utente [username=" + username + ", nome=" + nome + ", cognome=" + cognome + ", password=" + password
				+ "]";
	}
	public Integer getIdUtente() {
		return idUtente;
	}
	public void setIdUtente(Integer idUtente) {
		this.idUtente = idUtente;
	}
	public List<Utente> getIscrizioni() {
		return iscrizioni;
	}
	public void setIscrizioni(List<Utente> iscrizioni) {
		this.iscrizioni = iscrizioni;
	}
	public List<Utente> getIscritti() {
		return iscritti;
	}
	public void setIscritti(List<Utente> iscritti) {
		this.iscritti = iscritti;
	}
	public List<Post> getPost() {
		return post;
	}
	public void setPost(List<Post> post) {
		this.post = post;
	}	
}
