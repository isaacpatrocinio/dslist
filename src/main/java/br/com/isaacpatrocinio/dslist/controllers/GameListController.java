package br.com.isaacpatrocinio.dslist.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isaacpatrocinio.dslist.dto.GameListDTO;
import br.com.isaacpatrocinio.dslist.dto.GameMinDTO;
import br.com.isaacpatrocinio.dslist.services.GameListService;
import br.com.isaacpatrocinio.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	private GameListService gameListService;
	private GameService gameService;

	public GameListController(GameListService gameListService, GameService gameService) {
		this.gameListService = gameListService;
		this.gameService = gameService;
	}

	@GetMapping
	public List<GameListDTO> findAll() {
		return gameListService.findAll();
	}

	@GetMapping("/{listId}/games")
	public List<GameMinDTO> findAllGamesByListId(@PathVariable Long listId) {
		return gameService.findAllGamesByListId(listId);
	}
}
