package net.protoprint.beardbar.controllers;

import lombok.extern.slf4j.Slf4j;
import net.protoprint.beardbar.model.Beer;
import net.protoprint.beardbar.services.BeerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class BeerController {

	private final BeerService beerService;

	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}

	// Выводим список сортов (кранов) пива
	@GetMapping("/beers")
	public String listBeers(Model model){
		model.addAttribute("listBeers", this.beerService.listBeers());
		log.info("Вывели список кранов через Beer Controller.");
		return "/beers";
	}

	//Добавляем сорт (кран) пива
	@PostMapping("/beers")
	public String addBeer(@ModelAttribute("beers") Beer beer){
		if (beer.getId() == 0){
			// TODO: Обработка ошибок, когда ввели в числовое поле строку. Например в поле 'номер крана' название пива;
			this.beerService.addBeer(beer);
			log.info("Добавили пиво: " + beer);
		}
		return "redirect:/beers";
	}

	@GetMapping ("/beerEdit/{beer}")
	public String beerEdit(
			@PathVariable Beer beer,
			Model model
			)
	{
		model.addAttribute("beer", beer);
		log.info("Редактируем пиво: " + beer);
		return "/parts/beerEdit";
	}


		@PostMapping("/beerEdit{beer}")
	public String updateBeer(
			@PathVariable Beer beer,
			@RequestParam("tapNumber") String tupNumber,
			@RequestParam ("beerName") String beerName,
			@RequestParam ("beerCost") Double beerCost,
			@RequestParam ("beerBalance") Double beerBalance,
			Boolean beerStopped,
			Model model
	){

		log.info("Отредактировали пиво: " + beer);
		if (!StringUtils.isEmpty(beerName) & !StringUtils.isEmpty(beerCost) & !StringUtils.isEmpty(beerBalance)){
			beer.setBeerName(beerName);
			beer.setBeerCost(beerCost);
			beer.setBeerBalance(beerBalance);
			if (beerStopped==null){
				beer.setBeerStopped(false);
			} else {
				beer.setBeerStopped(true);
			}
		}
		beerService.updateBeer(beer);
		return "redirect:/beers";
	}
}

