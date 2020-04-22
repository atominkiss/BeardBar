package net.protoprint.beardbar.services;

import lombok.extern.slf4j.Slf4j;
import net.protoprint.beardbar.model.Beer;
import net.protoprint.beardbar.repos.BeerDao;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
		log.info("Сохранили пивао в базу: " + beer);
	}

	@Override
	public void updateBeer(Beer beers) {

	}

	@Override
	public void deleteBeer(Beer beer) {
//		log.info("Удаляем пиво: " + beer);
//		beerDao.delete(beer);
	}

	@Override
	public Optional<Beer> getBeerById(Long id) {
		return beerDao.findById(id);
	}

	@Override
	public Iterable<Beer> listBeers() {
		log.info("Список кранов в методе Сервиса Iterable<Beer> listBeers()" + beerDao.findAll());
		return beerDao.findAll();
	}
}
