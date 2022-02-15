package com.CeylonSea.InventoryManagement;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface InventoryRepository extends JpaRepository<Inventory, Long> {

	@Query("SELECT p FROM Inventory p WHERE CONCAT(p.name, ' ',p.type,' ',p.quantity,p.price,p.description, ' ' ) LIKE %?1%")
	public List<Inventory> search(String keyword);
}
