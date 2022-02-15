package com.CeylonSea.InventoryManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InventoryController {
	 
	@Autowired
    private InventoryService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Inventory> listInventory = service.listAll();
		model.addAttribute("listInventory", listInventory);
		
		
		return "index";
		
	}
	@RequestMapping("/asd")
	public String viewHomePage(Model model, @Param("keyword") String keyword) {
		List<Inventory> listInventory = service.listAll(keyword);
		model.addAttribute("listInventory", listInventory);
		model.addAttribute("keyword", keyword);
		
		return "index";
	}

	@RequestMapping("/new")
	public String showNewInventoryForm(Model model) {
		Inventory inventory = new Inventory();
		model.addAttribute("inventory",inventory);
		return "new_inventory";
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveInventory(@ModelAttribute("inventory")Inventory inventory) {
		service.save(inventory);
		
		return "redirect:/";
		
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditInventoryForm(@PathVariable(name = "id")Long id ) {
		ModelAndView mav = new ModelAndView("update_inventory");
		
		Inventory inventory = service.get(id);
		mav.addObject("inventory",inventory);
		
		return mav;
		
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteInventory(@PathVariable(name = "id")Long id) {
		service.delete(id);
		
		return "redirect:/";
	}
}
