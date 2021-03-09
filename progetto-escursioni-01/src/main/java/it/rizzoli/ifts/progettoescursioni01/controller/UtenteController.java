package it.rizzoli.ifts.progettoescursioni01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.rizzoli.ifts.progettoescursioni01.model.Utente;
import it.rizzoli.ifts.progettoescursioni01.repository.UtenteRepository;

@CrossOrigin(origins = "*")
@RestController
public class UtenteController {
	
	@Autowired
	private UtenteRepository repository;
	
	@GetMapping("/utenti")
	public List<Utente> all() {
		return repository.findAll();
	}

	@GetMapping("/utenti/{id}")
	public Utente byUsername(@PathVariable Integer id) {
		return repository.findById(id).orElseThrow();
	}

	@PostMapping("/utenti")
	public Utente inserisci(@RequestBody Utente utente) {
		return repository.save(utente);
	}

	@PutMapping("/utenti/{id}")
	public Utente aggiorna(@RequestBody Utente utente, @PathVariable Integer id) {
		repository.findById(id).ifPresentOrElse((u) -> {
			u.setNome(utente.getNome());
			u.setCognome(utente.getCognome());
			u.setPassword(utente.getPassword());
			repository.save(u);
		}, () -> {
			repository.save(utente);
			});
		return repository.findById(id).get();
	}
	
	@DeleteMapping("/utenti/{id}")
	public void elimina(@PathVariable Integer id) {
		repository.deleteById(id);	
	}
	
	@GetMapping("/iscrizioni/{id}")
	public List<Utente> iscrizioni(@PathVariable Integer id) {
		Utente u= repository.findById(id).orElseThrow();
		return u.getIscrizioni();
	}

}
