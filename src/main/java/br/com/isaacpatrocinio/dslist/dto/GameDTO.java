package br.com.isaacpatrocinio.dslist.dto;

public class GameDTO {
	private Long id;
	private String title;
	private Integer gameYear;
	private String genre;
	private String shortDescription;
	private String longDescription;
	private String platforms;
	private Double score;
	private String imgUrl;
	
	public GameDTO() {
		
	}

	public GameDTO(Long id, String title, Integer gameYear, String genre, String shortDescription, String longDescription, String platforms, Double score, String imgUrl) {
		this.id = id;
		this.title = title;
		this.gameYear = gameYear;
		this.genre = genre;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
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

	public String getGenre() {
		return genre;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public String getPlatforms() {
		return platforms;
	}

	public Double getScore() {
		return score;
	}

	public String getImgUrl() {
		return imgUrl;
	}
	
}
