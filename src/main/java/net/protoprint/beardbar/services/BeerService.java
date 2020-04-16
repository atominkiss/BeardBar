package net.protoprint.beardbar.services;

import net.protoprint.beardbar.model.Beer;

import java.util.List;

public interface BeerService {

	void addBeer(Beer beers);

	void updateBeer(Beer beers);

	void deleteBeer(int id);

	Beer getBeerById(int id);

	List<Beer> listBeers();
}
