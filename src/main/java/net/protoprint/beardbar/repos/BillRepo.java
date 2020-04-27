package net.protoprint.beardbar.repos;

import net.protoprint.beardbar.model.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillRepo extends CrudRepository<Bill, Long> {
}
