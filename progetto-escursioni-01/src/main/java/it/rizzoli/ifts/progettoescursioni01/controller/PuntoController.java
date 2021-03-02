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

import it.rizzoli.ifts.progettoescursioni01.model.Punto;
import it.rizzoli.ifts.progettoescursioni01.repository.PuntoRepository;

@RestController
public class PuntoController {
	
	@Autowired
	private PuntoRepository repository;
	
	@GetMapping("/tappe")
	public List<Punto> all() {
		return repository.findAll();
	}

	@GetMapping("/tappe/{idPunto}")
	public Punto byId(@PathVariable Integer idPunto) {
		return repository.findById(idPunto).orElseThrow();
	}

	@PostMapping("/tappe")
	public Punto inserisci(@RequestBody Punto tappa) {
		return repository.save(tappa);
	}
	
	@PutMapping("/tappe/{idPunto}")
	public Punto aggiorna(@RequestBody Punto tappa, @PathVariable Integer idPunto) {
		repository.findById(idPunto).ifPresentOrElse((p) -> {
			p.setNome(tappa.getNome());
			p.setLatitudine(tappa.getLatitudine());
			p.setLongitudine(tappa.getLongitudine());
			p.setOrdine(tappa.getOrdine());
			p.setPoi(tappa.getPoi());
			repository.save(p);
		}, () -> {
			repository.save(tappa);
			});
		return repository.findById(idPunto).get();
	}
	
	@DeleteMapping("/tappe/{idPunto}")
	public void elimina(@PathVariable Integer idPunto) {
		repository.deleteById(idPunto);	
	}

}
