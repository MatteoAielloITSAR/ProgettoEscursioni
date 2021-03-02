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

import it.rizzoli.ifts.progettoescursioni01.model.Immagine;
import it.rizzoli.ifts.progettoescursioni01.model.Utente;
import it.rizzoli.ifts.progettoescursioni01.repository.ImmagineRepository;
import it.rizzoli.ifts.progettoescursioni01.repository.UtenteRepository;

@RestController
public class ImmagineController {
	
	@Autowired
	private ImmagineRepository repository;

	@GetMapping("/immagini")
	public List<Immagine> all() {
		return repository.findAll();
	}

	@GetMapping("/immagini/{idImmagine}")
	public Immagine byImmagine(@PathVariable Integer idImmagine) {
		return repository.findById(idImmagine).orElseThrow();
	}
	
	@PostMapping("/immagini")
	public Immagine inserisci(@RequestBody Immagine immagine) {
		return repository.save(immagine);
		}
	
	@PutMapping("/immagini/{idImmagine}")
	public Immagine aggiorna(@RequestBody Immagine immagine, @PathVariable Integer idImmagine) {
		repository.findById(idImmagine).ifPresentOrElse((i) -> {
			i.setPercorsoFile(immagine.getPercorsoFile());
			repository.save(i);
		}, () -> {
			repository.save(immagine);
			});
		return repository.findById(idImmagine).get();
	}
	
	@DeleteMapping("/immagini/{idImmagine}")
	public void elimina(@PathVariable Integer idImmagine) {
			repository.deleteById(idImmagine);
		}
	}


