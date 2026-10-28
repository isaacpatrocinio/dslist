package br.com.isaacpatrocinio.dslist.dto;

public class GameDTO {
	private Long id;
	private String title;
	private Integer gameYear;
	private String shortDescription;
	
	public GameDTO() {
	}
	
	public GameDTO(Long id, String title, Integer gameYear, String shortDescription) {
		this.id = id;
		this.title = title;
		this.gameYear = gameYear;
		this.shortDescription = shortDescription;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getGameYear() {
		return gameYear;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
}
