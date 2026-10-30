package br.com.isaacpatrocinio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import br.com.isaacpatrocinio.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	@Modifying
	@Query(nativeQuery = true, value = """
			UPDATE TB_BELONGING SET TB_BELONGING.POSITION = :newPosition
			WHERE TB_BELONGING.GAME_LIST_ID = :listId
			AND TB_BELONGING.GAME_ID = :gameId 
			""")
	void moveGameOnList(Long listId, Long gameId, int newPosition);
}
