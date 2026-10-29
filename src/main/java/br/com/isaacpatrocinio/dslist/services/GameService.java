package br.com.isaacpatrocinio.dslist.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.isaacpatrocinio.dslist.dto.DTOMapper;
import br.com.isaacpatrocinio.dslist.dto.GameDTO;
import br.com.isaacpatrocinio.dslist.dto.GameMinDTO;
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
		var dtoList = list.stream().map(x -> DTOMapper.gameEntityToMinDTO(x)).toList();
		return dtoList;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		var objOptional = gameRepository.findById(id);
		var objDto = objOptional.stream().map(x -> DTOMapper.gameEntityToDTO(x));
		return objDto.findFirst().orElse(null);
	}
}
