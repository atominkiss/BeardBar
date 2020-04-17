package net.protoprint.beardbar.services;

import lombok.extern.slf4j.Slf4j;
import net.protoprint.beardbar.dao_repos.BeerDao;
import net.protoprint.beardbar.model.Beer;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService{

	private final BeerDao beerDao;

	public BeerServiceImpl(BeerDao beerDao) {
		this.beerDao = beerDao;
	}

	@Override
	public void addBeer(Beer beer) {
		beerDao.save(beer);
		log.info("Added beer: " + beer);
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
	public Iterable<Beer> listBeers() {
		log.info("Передали список кранов в сервис");
		return beerDao.findAll();
	}
}
