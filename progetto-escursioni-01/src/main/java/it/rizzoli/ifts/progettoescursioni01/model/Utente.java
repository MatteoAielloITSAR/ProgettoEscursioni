package it.rizzoli.ifts.progettoescursioni01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utente {
	
	@Id
	@Column(length = 20)
	private String username;
	
	@Column(nullable = false, length = 20)
	private String nome;
	
	@Column(nullable = false, length = 20)
	private String cognome;
	
	@Column(nullable = false, length = 20)
	private String password;
	
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
}
