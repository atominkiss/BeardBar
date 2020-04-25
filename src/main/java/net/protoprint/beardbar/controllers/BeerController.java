package net.protoprint.beardbar.controllers;

import lombok.extern.slf4j.Slf4j;
import net.protoprint.beardbar.model.Beer;
import net.protoprint.beardbar.services.BeerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	// выводим заполненную форму редактирования конкретного пива (крана)
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


	//Сохраняем отредактированные данные пива.
	@PostMapping("/beerEdit/{beer}")
	public String updateBeer(
			@PathVariable Beer beer,
			@RequestParam("tapNumber") Integer tapNumber,
			@RequestParam ("beerName") String beerName,
			@RequestParam ("beerCost") Double beerCost,
			@RequestParam ("beerBalance") Double beerBalance,
			//required = false - потому что с формы возвращается null, если кран не на стопе. Соответственно после этого будет NullPointerException.Замену null на false делаем в методе BeerServiceImpl
			@RequestParam (name = "beerStopped", required = false) Boolean  beerStopped
	){


		beerService.updateBeer(beer, tapNumber, beerName, beerCost, beerBalance, beerStopped);
		log.info("Отредактировали пиво: " + beer);
		return "redirect:/";
	}

	//TODO: "Удаление крана - нужно ли?"

}

