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
	private GameRepository gameRepository;

	public GameListService(GameListRepository gameListRepository, GameRepository gameRepository) {
		this.gameListRepository = gameListRepository;
		this.gameRepository = gameRepository;
	}
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		var list = gameListRepository.findAll();
		var dtoList = list.stream().map(x -> DTOMapper.gameListEntityToDTO(x)).toList();
		return dtoList;
	}
	
	@Transactional
	public void moveGame(Long listId, int sourceIndex, int destinationIndex) {
		var list = gameRepository.findAllByListId(listId);

		var targetGame = list.remove(sourceIndex);
		list.add(destinationIndex, targetGame);
		
		var min = (sourceIndex < destinationIndex) ? sourceIndex : destinationIndex; 
		var max = (sourceIndex > destinationIndex) ? sourceIndex : destinationIndex;
		
		for(int i = min; i <= max; i++) {
			gameListRepository.moveGameOnList(listId, list.get(i).getId(), i);
		}
	}
}
