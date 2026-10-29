package br.com.isaacpatrocinio.dslist.dto;

import br.com.isaacpatrocinio.dslist.entities.Game;
import br.com.isaacpatrocinio.dslist.entities.GameList;
import br.com.isaacpatrocinio.dslist.projections.GameMinProjection;

public class DTOMapper {

	public static GameMinDTO gameEntityToMinDTO(Game entity) {
		return new GameMinDTO(entity.getId(), entity.getTitle(), entity.getYear(), entity.getShortDescription());
	}

	public static GameDTO gameEntityToDTO(Game entity) {
		return new GameDTO(entity.getId(), entity.getTitle(), entity.getYear(), entity.getGenre(),
				entity.getShortDescription(), entity.getLongDescription(), entity.getPlatforms(), entity.getScore(),
				entity.getImgUrl());
	}

	public static GameListDTO gameListEntityToDTO(GameList entity) {
		return new GameListDTO(entity.getId(), entity.getName());
	}

	public static GameMinDTO gameMinProjectionToMinDTO(GameMinProjection projection) {
		return new GameMinDTO(projection.getId(), projection.getTitle(), projection.getGameYear(),projection.getShortDescription());
	}
}
