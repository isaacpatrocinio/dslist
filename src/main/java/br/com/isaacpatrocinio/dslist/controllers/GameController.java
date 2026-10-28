package br.com.isaacpatrocinio.dslist.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isaacpatrocinio.dslist.dto.GameDTO;
import br.com.isaacpatrocinio.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	private GameService gameService;
	public GameController(GameService gameService) {
		this.gameService = gameService;
	}
	
	@GetMapping
	public List<GameDTO> findAll() {
		return gameService.findAll();
	}
}
