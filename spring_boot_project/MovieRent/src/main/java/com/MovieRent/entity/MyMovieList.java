package com.MovieRent.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyMovies")
public class MyMovieList {
	
	@Id
	private int id;
	private String name;
	private String genre;
	private String price;
	public MyMovieList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyMovieList(int id, String name, String genre, String price) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.price = price;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
