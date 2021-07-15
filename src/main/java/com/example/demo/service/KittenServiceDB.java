package com.example.demo.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.data.Kitten;
import com.example.demo.interfaces.KittenService;
import com.example.demo.repos.KittenRepo;

@Service
@Primary
public class KittenServiceDB implements KittenService{

	private KittenRepo repo;
	
	public KittenServiceDB(KittenRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Kitten getKittenById(int id) {
		return this.repo.findById(id).get();
	}

	@Override
	public List<Kitten> getAllKittens() {
		return this.repo.findAll();
	}

	@Override
	public Kitten createKitten(Kitten kitten) {
		return this.repo.save(kitten);
		
	}

	@Override
	public Kitten updateKitten(int id, Kitten kitten) {
		//pulls existing record
		Kitten found = this.repo.getById(id);
		
		//modify the record
		found.setAge(kitten.getAge());
		found.setBreed(kitten.getBreed());
		found.setCuteness(kitten.getCuteness());
		found.setName(kitten.getName());
		
		Kitten updated = this.repo.save(found);
		return updated;
	}

	@Override
	public String deleteKitten(int id) {
		this.repo.deleteById(id);
		return "Deleted: " + id;
	}

	@Override
	public List<Kitten> findByName(String name) {
		return this.repo.findByNameIgnoreCase(name);
	}

	
	
}
