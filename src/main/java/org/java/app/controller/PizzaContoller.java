package org.java.app.controller;



import java.util.List;

import org.java.app.pojo.Pizza;
import org.java.app.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PizzaContoller {
	
	@Autowired
	private PizzaService pizzaService;
	
	@GetMapping("/")
	public String getIndex(Model model, @RequestParam(required= false) String name) {
		List<Pizza> pizzas = name == null ? pizzaService.findAll() : pizzaService.filterByName(name, name);
		model.addAttribute("pizzas", pizzas);
		return "index";
	}
	
	@GetMapping("/{id}")
	public String show(Model model, @PathVariable int id) {
		
		Pizza pizza = pizzaService.findById(id);
		model.addAttribute("pizza", pizza);	
		return "show";
	}
	@GetMapping("/create")
	public String getCreateForm(Model model) {
		
		model.addAttribute("pizza", new Pizza());
		
		return "create";
	}

}
