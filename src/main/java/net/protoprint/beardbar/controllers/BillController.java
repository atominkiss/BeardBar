package net.protoprint.beardbar.controllers;

import lombok.extern.slf4j.Slf4j;
import net.protoprint.beardbar.services.BillService;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class BillController {

	private final BillService billService;

	public BillController(BillService billService) {
		this.billService = billService;
	}
}
