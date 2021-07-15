package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.data.Kitten;
import com.example.demo.interfaces.KittenService;

@Service
public class KittenServiceList implements KittenService{

List<Kitten> kittens = new ArrayList<>();
	

	public Kitten getKittenById(int id) {
		Kitten found =  this.kittens.get(id);
		return found;
	}
	

	public List<Kitten> getAllKittens() {
		return kittens;
	}


	public Kitten createKitten(Kitten kitten) {
		this.kittens.add(kitten);
		return this.kittens.get(this.kittens.size() - 1);
	}
	

	public Kitten updateKitten(int id, Kitten kitten) {
		return this.kittens.set(id, kitten); //replace kitten at index id
		
	}


	public String deleteKitten(int id) {
		this.kittens.remove(id);
		return "Deleted kitten with ID: " + id;
	}


	@Override
	public List<Kitten> findByName(String name) {
		return this.findByName(name);
	}
	
}
