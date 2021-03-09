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

import it.rizzoli.ifts.progettoescursioni01.model.Post;
import it.rizzoli.ifts.progettoescursioni01.model.Utente;
import it.rizzoli.ifts.progettoescursioni01.repository.UtenteRepository;

@CrossOrigin(origins = "*")
@RestController
public class UtenteController {
	
	@Autowired
	private UtenteRepository repository;
	
	
	
	@PostMapping("/utenti/{idUtente}")
	public Utente inserisciPost(@RequestBody Post post, @PathVariable Integer idUtente) {
		Utente utente = repository.findById(idUtente).orElseThrow();
		utente.getPost().add(post);
		return repository.save(utente);
	}
	
	@GetMapping("/utenti")
	public List<Utente> all() {
		return repository.findAll();
	}


	@PostMapping("/utenti")
	public Utente inserisci(@RequestBody Utente utente) {
		return repository.save(utente);
	}

	@GetMapping("/utenti/{username}")
	public Utente byUsername(@PathVariable Integer username) {
		return repository.findById(username).orElseThrow();
	}

	@PutMapping("/utenti/{username}")
	public Utente aggiorna(@RequestBody Utente utente, @PathVariable Integer username) {
		repository.findById(username).ifPresentOrElse((u) -> {
			u.setNome(utente.getNome());
			u.setCognome(utente.getCognome());
			u.setPassword(utente.getPassword());
			repository.save(u);
		}, () -> {
			repository.save(utente);
			});
		return repository.findById(username).get();
	}
	
	@DeleteMapping("/utenti/{username}")
	public void elimina(@PathVariable Integer username) {
		repository.deleteById(username);	
	}

}
