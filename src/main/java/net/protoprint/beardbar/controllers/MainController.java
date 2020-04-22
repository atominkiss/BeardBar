package net.protoprint.beardbar.controllers;

import lombok.extern.slf4j.Slf4j;
import net.protoprint.beardbar.model.Beer;
import net.protoprint.beardbar.services.BeerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MainController {

	private final BeerService beerService;

	public MainController(BeerService beerService) {
		this.beerService = beerService;
	}


	@GetMapping("/")
	public String mainWindow(Model model) {
		//Добавляем на главную страницу список кранов
		Iterable<Beer> beers = beerService.listBeers();
		model.addAttribute("beers", beers);
		log.info("Вывели список кранов через Main Controller: " + beers.toString());
//
//		//Добавляем на главную страницу список снэков
//		Iterable<Snacks> snacks = snacksRepo.findAll();
//		model.addAttribute("snacks", snacks);
//
//		//Добавляем на главную страницу список заказов
//		Iterable<Orders> orders = ordersRepo.findAll();
//		model.addAttribute("orders", orders);
		return "mainWindow";
	}

}
