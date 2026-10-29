package br.com.isaacpatrocinio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaacpatrocinio.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
}
