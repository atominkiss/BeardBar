package net.protoprint.beardbar.services;

import net.protoprint.beardbar.model.Beer;

import java.util.Optional;


public interface BeerService {

	void addBeer(Beer beer);

	void updateBeer(Beer beer, Integer tapNumber, String beerName, Double beerCost, Double beerBalance, Boolean beerStopped);

	void deleteBeer(Beer beer);


	Optional<Beer> getBeerById(Long id);

	Iterable<Beer> listBeers();
}
