package br.com.isaacpatrocinio.dslist.dto;

public record GameDTO(
	Long id,
	String title,
	Integer gameYear,
	String genre,
	String shortDescription,
	String longDescription,
	String platforms,
	Double score,
	String imgUrl
) {}