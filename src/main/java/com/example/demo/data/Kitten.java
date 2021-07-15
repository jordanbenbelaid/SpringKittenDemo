package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 	//tells spring this class represents a table in the database
public class Kitten {

	@Id		//primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String breed;
	
	private int age;
	private int cuteness;
	
	
	public Kitten() {
		//default constructor
	}

	public Kitten(int id, String name, String breed, int age, int cuteness) {
		super();
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.cuteness = cuteness;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getCuteness() {
		return cuteness;
	}


	public void setCuteness(int cuteness) {
		this.cuteness = cuteness;
	}


	@Override
	public String toString() {
		return "Kitten [id=" + id + ", name=" + name + ", breed=" + breed + ", age=" + age + ", cuteness=" + cuteness
				+ "]";
	}
	
	
	
}
