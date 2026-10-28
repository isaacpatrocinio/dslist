package br.com.isaacpatrocinio.dslist.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.isaacpatrocinio.dslist.dto.DTOMapper;
import br.com.isaacpatrocinio.dslist.dto.GameDTO;
import br.com.isaacpatrocinio.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	private GameRepository gameRepository;
	public GameService(GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}
	
	public List<GameDTO> findAll() {
		var list = gameRepository.findAll();
		var dtoList = list.stream().map(x -> DTOMapper.gameEntityToDTO(x)).toList();
		return dtoList;
	}
}
