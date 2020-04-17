package net.protoprint.beardbar.controllers;

import lombok.extern.slf4j.Slf4j;
import net.protoprint.beardbar.model.Beer;
import net.protoprint.beardbar.services.BeerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class BeerController {

	private final BeerService beerService;

	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}

	// Выводим список сортов пива
	@GetMapping("/beers")
	public String listBeers(Model model){
		model.addAttribute("listBeers", this.beerService.listBeers());
		log.info("вывели список кранов через контроллер.");
		return "/beers";
	}

	@PostMapping("/beers")
	public String addBeer(@ModelAttribute("beers") Beer beer){
		if (beer.getId() == null){
			this.beerService.addBeer(beer);
			log.info("Добавили пиво: " + beer);
		}else {
			this.beerService.updateBeer(beer);
			log.info("Обновили данные пива: " + beer);
		}

		return "redirect:/beers";
	}

}
