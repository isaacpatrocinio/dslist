package br.com.isaacpatrocinio.dslist.dto;

import br.com.isaacpatrocinio.dslist.entities.Game;

public class DTOMapper {

	public static GameDTO gameEntityToDTO(Game entity) {
		return new GameDTO(entity.getId(), entity.getTitle(), entity.getYear(), entity.getShortDescription());
	}
}
