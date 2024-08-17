package com.MovieRent.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String genre;
	private BigDecimal price;  // Changed from String to BigDecimal

	public Movie(int id, String name, String genre, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.price = price;
	}

	public Movie(String name, String genre, BigDecimal price) {  // Constructor without id
		this.name = name;
		this.genre = genre;
		this.price = price;
	}

	public Movie() {
		// Default constructor
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

	public BigDecimal getPrice() {  // Changed from String to BigDecimal
		return price;
	}

	public void setPrice(BigDecimal price) {  // Changed from String to BigDecimal
		this.price = price;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"id=" + id +
				", name='" + name + '\'' +
				", genre='" + genre + '\'' +
				", price=" + price +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Movie movie = (Movie) o;

		return id == movie.id;
	}

	@Override
	public int hashCode() {
		return id;
	}
}
