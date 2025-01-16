package br.com.wallissonalves.placeserviceapi.api;

import jakarta.validation.constraints.NotBlank;

public record PlaceRequest 
	(@NotBlank String name,@NotBlank String city,@NotBlank String state){}