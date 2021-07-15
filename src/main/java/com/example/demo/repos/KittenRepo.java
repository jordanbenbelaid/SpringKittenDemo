package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Kitten;

@Repository
public interface KittenRepo extends JpaRepository<Kitten, Integer>{

	List<Kitten> findByNameIgnoreCase(String name);				//Not case sensitive with the IgnoreCase added
}
