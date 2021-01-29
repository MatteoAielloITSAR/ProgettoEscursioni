package it.rizzoli.ifts.progettoescursioni01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PuntoDiInteresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPuntodiInteresse;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column(nullable = false, length = 20)
	private String tipologia;

	@Override
	public String toString() {
		return "PuntoDiInteresse [idPuntodiInteresse=" + idPuntodiInteresse + ", nome=" + nome + ", tipologia="
				+ tipologia + "]";
	}

}
