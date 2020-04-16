package net.protoprint.beardbar.services;

import lombok.extern.slf4j.Slf4j;
import net.protoprint.beardbar.dao.BeerDao;
import net.protoprint.beardbar.model.Beer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService{

	private final BeerDao beerDao;

	public BeerServiceImpl(BeerDao beerDao) {
		this.beerDao = beerDao;
	}

	@Override
	public void addBeer(Beer beers) {
		beerDao.addBeer(beers);
		log.info("Added beer: " + beers);
	}

	@Override
	public void updateBeer(Beer beers) {

	}

	@Override
	public void deleteBeer(int id) {

	}

	@Override
	public Beer getBeerById(int id) {
		return null;
	}

	@Override
	public List<Beer> listBeers() {
		return null;
	}
}
