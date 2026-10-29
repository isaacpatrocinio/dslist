package br.com.isaacpatrocinio.dslist.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.isaacpatrocinio.dslist.dto.DTOMapper;
import br.com.isaacpatrocinio.dslist.dto.GameDTO;
import br.com.isaacpatrocinio.dslist.dto.GameMinDTO;
import br.com.isaacpatrocinio.dslist.projections.GameMinProjection;
import br.com.isaacpatrocinio.dslist.repositories.GameRepository;

@Service
public class GameService {

	private GameRepository gameRepository;

	public GameService(GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		var list = gameRepository.findAll();
		var minDtoList = list.stream().map(x -> DTOMapper.gameEntityToMinDTO(x)).toList();
		return minDtoList;
	}

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		var optionalObj = gameRepository.findById(id);
		var dtoObj = optionalObj.stream().map(x -> DTOMapper.gameEntityToDTO(x));
		return dtoObj.findFirst().orElse(null);
	}

	public List<GameMinDTO> findAllGamesByListId(Long listId) {
		var projList = gameRepository.findAllByListId(listId);
		var minDtoList = projList.stream().map(x -> DTOMapper.gameMinProjectionToMinDTO(x)).toList();
		return minDtoList;
	}
}
