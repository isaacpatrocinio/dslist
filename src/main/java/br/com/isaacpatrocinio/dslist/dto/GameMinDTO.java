package br.com.isaacpatrocinio.dslist.dto;

public record GameMinDTO(
	Long id,
	String title,
	Integer gameYear,
	String shortDescription
) {}