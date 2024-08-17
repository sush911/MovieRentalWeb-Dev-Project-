package com.MovieRent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MovieRent.entity.Movie;
import com.MovieRent.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository bRepo;
	
	public void save(Movie b) {
		bRepo.save(b);
	}
	
	public List<Movie> getAllMovie(){
		return bRepo.findAll();
	}
	
	public Movie getMovieById(int id) {
		return bRepo.findById(id).get();
	}
	public void deleteById(int id) {
		bRepo.deleteById(id);
	}
}
