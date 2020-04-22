package net.protoprint.beardbar.services;

import lombok.extern.slf4j.Slf4j;
import net.protoprint.beardbar.model.Beer;
import net.protoprint.beardbar.repos.BeerRepo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService{

	private final BeerRepo beerRepo;

	public BeerServiceImpl(BeerRepo beerRepo) {
		this.beerRepo = beerRepo;
	}

	@Override
	public void addBeer(Beer beer) {
		beerRepo.save(beer);
		log.info("Сохранили пиво в базу: " + beer);
	}

	@Override
	public void updateBeer(Beer beer, Integer tapNumber, String beerName, Double beerCost, Double beerBalance, Boolean beerStopped) {
		//если кран не на стопе, то с формы возвращается null. Тут мы меняем null на false
		if (beerStopped == null){
			beer.setBeerStopped(false);
		} else {
			beer.setBeerStopped(true);
		}
		if (!StringUtils.isEmpty(beer.getBeerName()) & !StringUtils.isEmpty(beer.getBeerCost()) & !StringUtils.isEmpty(beer.getBeerBalance())){
			beer.setBeerName(beerName);
			beer.setBeerCost(beerCost);
			beer.setBeerBalance(beerBalance);

		}
		beerRepo.save(beer);
		log.info("Сохранили пиво в базу: " + beer);

	}

	@Override
	public void deleteBeer(Beer beer) {
//		log.info("Удаляем пиво: " + beer);
//		beerRepo.delete(beer);
	}

	@Override
	public Optional<Beer> getBeerById(Long id) {
		return beerRepo.findById(id);
	}

	@Override
	public Iterable<Beer> listBeers() {
		log.info("Список кранов в методе Сервиса Iterable<Beer> listBeers()" + beerRepo.findAll());
		return beerRepo.findAll();
	}
}
