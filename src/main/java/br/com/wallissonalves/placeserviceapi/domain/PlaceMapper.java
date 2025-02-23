package br.com.wallissonalves.placeserviceapi.domain;

import org.springframework.util.StringUtils;

import br.com.wallissonalves.placeserviceapi.api.PlaceRequest;
import br.com.wallissonalves.placeserviceapi.api.PlaceResponse;

public class PlaceMapper {
	public static Place updatedPlaceFromDto(PlaceRequest placeRequest, Place place) {
		final String name = StringUtils.hasText(placeRequest.name()) ? placeRequest.name() : place.name();
		final String city = StringUtils.hasText(placeRequest.city()) ? placeRequest.city() : place.city();
		final String state = StringUtils.hasText(placeRequest.state()) ? placeRequest.state() : place.state();
		return new Place(place.id(), name, place.slug(), city, state, place.createdAt(), place.updatedAt());
	}
	
	public static PlaceResponse toResponse (Place place) {
		return new PlaceResponse(place.name(),place.slug(),place.city(),place.state(),place.createdAt(),place.updatedAt());
	}
}
