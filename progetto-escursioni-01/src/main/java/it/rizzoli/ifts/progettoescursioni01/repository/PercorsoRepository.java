package it.rizzoli.ifts.progettoescursioni01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.rizzoli.ifts.progettoescursioni01.model.Percorso;

public interface PercorsoRepository extends JpaRepository<Percorso, Integer> {

}
