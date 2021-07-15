package com.example.demo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Kitten;
import com.example.demo.interfaces.KittenService;

@RestController
public class KittenController {

	//dependency
	private KittenService service;
	
	//Spring injecting it into my class
	public KittenController(KittenService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/kittens/getById/{id}")
	public Kitten getKittenById(@PathVariable int id) {
		return this.service.getKittenById(id);	
	}
	
	@GetMapping("getByName/{name}")
	public List<Kitten> findByName(@PathVariable String name){
		return this.service.findByName(name);
	}
	
	@GetMapping("/kittens/getAll")
	public List<Kitten> getAllKittens() {
		return service.getAllKittens();
	}

	@PostMapping("/kittens/create")
	public Kitten createKitten(@RequestBody Kitten kitten) {
		return this.service.createKitten(kitten);
	}
	
	@PutMapping("/kittens/update/{id}")
	public Kitten updateKitten(@PathVariable int id, @RequestBody Kitten kitten) {
		return this.service.updateKitten(id, kitten); //replace kitten at index id
	}

	@DeleteMapping("/kittens/delete/{id}")
	public String deleteKitten(@PathVariable int id) {
		return this.service.deleteKitten(id);
	}
}
