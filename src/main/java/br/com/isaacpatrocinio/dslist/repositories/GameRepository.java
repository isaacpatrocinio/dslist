package br.com.isaacpatrocinio.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.isaacpatrocinio.dslist.entities.Game;
import br.com.isaacpatrocinio.dslist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long> {

	@Query(nativeQuery = true, value = """
			SELECT game.ID, game.TITLE, game.GAME_YEAR AS gameYear, game.IMG_URL AS imgUrl, game.SHORT_DESCRIPTION AS shortDescription, belonging.POSITION
			FROM TB_GAME game
			INNER JOIN TB_BELONGING belonging ON belonging.GAME_ID = game.ID
			WHERE belonging.GAME_LIST_ID = :listId
			ORDER BY belonging.POSITION
				""")
	List<GameMinProjection> findAllByListId(Long listId);
}