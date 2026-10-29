package br.com.isaacpatrocinio.dslist.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.isaacpatrocinio.dslist.dto.DTOMapper;
import br.com.isaacpatrocinio.dslist.dto.GameListDTO;
import br.com.isaacpatrocinio.dslist.projections.GameMinProjection;
import br.com.isaacpatrocinio.dslist.repositories.GameListRepository;
import br.com.isaacpatrocinio.dslist.repositories.GameRepository;

@Service
public class GameListService {

	private GameListRepository gameListRepository;

	public GameListService(GameListRepository gameListRepository) {
		this.gameListRepository = gameListRepository;
	}
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		var list = gameListRepository.findAll();
		var dtoList = list.stream().map(x -> DTOMapper.gameListEntityToDTO(x)).toList();
		return dtoList;
	}
}
