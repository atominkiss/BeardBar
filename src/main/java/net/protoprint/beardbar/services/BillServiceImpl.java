package net.protoprint.beardbar.services;


import lombok.extern.slf4j.Slf4j;
import net.protoprint.beardbar.repos.BillRepo;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BillServiceImpl implements BillService{

	private final BillRepo billRepo;

	public BillServiceImpl(BillRepo billRepo) {
		this.billRepo = billRepo;
	}
}
