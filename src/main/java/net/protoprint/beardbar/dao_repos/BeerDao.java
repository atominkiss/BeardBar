package net.protoprint.beardbar.dao_repos;

import net.protoprint.beardbar.model.Beer;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface BeerDao extends CrudRepository<Beer, Id> {

//	void addBeer(Beer beers);
//	void updateBeer(Beer beers);
//	void deleteBeer(int id);
//	Beer getBeerById(Long id);
//	Iterable<Beer> findAll();

}
