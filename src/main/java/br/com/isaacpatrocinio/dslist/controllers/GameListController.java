package br.com.isaacpatrocinio.dslist.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isaacpatrocinio.dslist.dto.GameListDTO;
import br.com.isaacpatrocinio.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	private GameListService gameListService;
	
	public GameListController(GameListService gameListService) {
		this.gameListService = gameListService;
	}
	
	@GetMapping
	public List<GameListDTO> findAll() {
		return gameListService.findAll();
	}
}
