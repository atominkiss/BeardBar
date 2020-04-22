package net.protoprint.beardbar.repos;

import net.protoprint.beardbar.model.Beer;
import org.springframework.data.repository.CrudRepository;


public interface BeerRepo extends CrudRepository<Beer, Long> {

	//List<Beer> findById(long tapNumber);
//	void addBeer(Beer beers);
//	void updateBeer(Beer beers);
//	void deleteBeer(int id);
//	Beer getBeerById(Long Id);
//	Iterable<Beer> findAll();

}
