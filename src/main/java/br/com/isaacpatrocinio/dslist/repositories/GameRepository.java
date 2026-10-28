package br.com.isaacpatrocinio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaacpatrocinio.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}