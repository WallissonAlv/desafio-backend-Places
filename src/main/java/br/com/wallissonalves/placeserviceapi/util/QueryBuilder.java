package br.com.wallissonalves.placeserviceapi.util;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import br.com.wallissonalves.placeserviceapi.domain.Place;

public class QueryBuilder {
	  private QueryBuilder() {}

	  public static Example<Place> makeQuery(Place planet) {
	    ExampleMatcher exampleMatcher = ExampleMatcher
	    									.matchingAll()
	    									.withIgnoreCase()
	    									.withIgnoreNullValues();
	    return Example.of(planet, exampleMatcher);
	  }
}