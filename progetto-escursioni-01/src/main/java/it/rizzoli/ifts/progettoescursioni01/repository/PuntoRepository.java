package it.rizzoli.ifts.progettoescursioni01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.rizzoli.ifts.progettoescursioni01.model.Punto;

public interface PuntoRepository extends JpaRepository<Punto, Integer> {

}
