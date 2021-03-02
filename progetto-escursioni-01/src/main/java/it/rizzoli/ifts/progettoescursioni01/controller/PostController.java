package it.rizzoli.ifts.progettoescursioni01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.rizzoli.ifts.progettoescursioni01.model.Post;
import it.rizzoli.ifts.progettoescursioni01.model.Utente;
import it.rizzoli.ifts.progettoescursioni01.repository.PostRepository;
import it.rizzoli.ifts.progettoescursioni01.repository.UtenteRepository;

@RestController
public class PostController {
	@Autowired
	private PostRepository repository;

	@GetMapping("/posts")
	public List<Post> all() {
		return repository.findAll();
	}

	@GetMapping("/posts/{idPost}")
	public Post byId(@PathVariable int idPost) {
		return repository.findById(idPost).orElseThrow();
	}

	@PostMapping("/posts")
	public Post inserisci(@RequestBody Post post) {
		return repository.save(post);
	}
	
	/*
	@PutMapping("/posts/{idPost}") // da finireeeeeeeeeeeeeeeeeee
	public Post aggiorna(@RequestBody Post post, @PathVariable int idPost) {
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
	*/
	
	@DeleteMapping("/posts/{idPost}")
	public void elimina(@PathVariable int idPost) {
		repository.deleteById(idPost);	
	}
	
}
