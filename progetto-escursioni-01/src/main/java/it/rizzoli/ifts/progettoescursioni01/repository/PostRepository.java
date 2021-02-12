package it.rizzoli.ifts.progettoescursioni01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.rizzoli.ifts.progettoescursioni01.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
