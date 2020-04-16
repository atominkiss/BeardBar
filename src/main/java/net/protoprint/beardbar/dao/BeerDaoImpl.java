package net.protoprint.beardbar.dao;

import lombok.extern.slf4j.Slf4j;
import net.protoprint.beardbar.model.Beer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;

@Transactional
@Repository
//подключаем логгер
@Slf4j
public class BeerDaoImpl implements BeerDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public void addBeer(Beer beers) {
		em.persist(beers);
		log.info("Добавили пиво в базу: " + beers);
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
	public ArrayList<Beer> listBeers() {
		return null;
	}
}
