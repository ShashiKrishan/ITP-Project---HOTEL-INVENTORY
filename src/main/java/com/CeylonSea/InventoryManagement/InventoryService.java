package com.CeylonSea.InventoryManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;
	
	public List<Inventory> listAll() {
		return inventoryRepository.findAll();
	}
	
	public List<Inventory> listAll(String keyword) {
		if (keyword != null) {
			return inventoryRepository.search(keyword);
		}
		return inventoryRepository.findAll();
	}
	
	public void save(Inventory inventory) {
		inventoryRepository.save(inventory);
	}
	
	public Inventory get(Long id) {
		return inventoryRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		inventoryRepository.deleteById(id);
	}
}
