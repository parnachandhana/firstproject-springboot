package com.example.firstproject;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import
org.springframework.web.bind.annotation.PathVariable;
import 
org.springframework.web.bind.annotation.RequestMapping;
import
org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class ItemController {
	List<Item> items = new ArrayList<>();
	@GetMapping("/item")
	public String addItem() {
		Item item = new Item(1,"pen","blue pen");
	items.add(item);
	return "item successfully";
	}
}



