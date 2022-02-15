package com.CeylonSea.InventoryManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ReportController {

	 
		@Autowired
	    private InventoryService service;
	    
		@RequestMapping("/report")
		public String viewHomePage(Model model) {
			List<Inventory> listInventory = service.listAll();
			model.addAttribute("listInventory", listInventory);
			
			return "report";
			
		}
		
		
		
		
	
	}

