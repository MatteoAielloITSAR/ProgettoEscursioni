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

import it.rizzoli.ifts.progettoescursioni01.model.Attrezzatura;
import it.rizzoli.ifts.progettoescursioni01.repository.AttrezzaturaRepository;

@RestController
public class AttrezzaturaController {
	
	@Autowired
	private AttrezzaturaRepository repository;
	
	@GetMapping("/attrezzo")
	public List<Attrezzatura> all() {
		return repository.findAll();
	}

	@GetMapping("/attrezzo/{idAttrezzatura}")
	public Attrezzatura byAttrezzo(@PathVariable Integer idAttrezzatura) {
		return repository.findById(idAttrezzatura).orElseThrow();
	}

	@PostMapping("/Attrezzo")
	public Attrezzatura inserisci(@RequestBody Attrezzatura attrezzo) {
		return repository.save(attrezzo);
	}
	
	@PutMapping("/Attrezzo/{idAttrezzatura}")
	public Attrezzatura aggiorna(@RequestBody Attrezzatura attrezzo, @PathVariable Integer idAttrezzatura) {
		repository.findById(idAttrezzatura).ifPresentOrElse((a) -> {
			a.setNome(attrezzo.getNome());
			repository.save(a);
		}, () -> {
			repository.save(attrezzo);
			});
		return repository.findById(idAttrezzatura).get();
	}
	
	@DeleteMapping("/attrezzo/{idAttrezzatura}")
	public void elimina(@PathVariable Integer idAttrezzatura) {
		repository.deleteById(idAttrezzatura);	
	}

}
