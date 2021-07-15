package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.data.Kitten;

public interface KittenService {

	public Kitten getKittenById(int id);
	
	public List<Kitten> getAllKittens();
	
	public Kitten createKitten(Kitten kitten);
	
	public Kitten updateKitten(int id, Kitten kitten);
	
	public String deleteKitten(int id);
	
	public List<Kitten> findByName(String name);
}
