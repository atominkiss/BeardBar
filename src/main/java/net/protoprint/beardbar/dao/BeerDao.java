package net.protoprint.beardbar.dao;

import net.protoprint.beardbar.model.Beer;

import java.util.ArrayList;

public interface BeerDao {

	void addBeer(Beer beers);
	void updateBeer(Beer beers);
	void deleteBeer(int id);
	Beer getBeerById(int id);
	ArrayList<Beer> listBeers();

}
