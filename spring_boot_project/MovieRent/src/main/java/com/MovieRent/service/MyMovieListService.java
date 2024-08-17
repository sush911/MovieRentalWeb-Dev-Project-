package com.MovieRent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MovieRent.entity.MyMovieList;
import com.MovieRent.repository.MyMovieRepository;

@Service
public class MyMovieListService {
	
	@Autowired
	private MyMovieRepository mymovie;
	
	public void saveMyMovies(MyMovieList movie) {
		mymovie.save(movie);
	}
	
	public List<MyMovieList> getAllMyMovies(){
		return mymovie.findAll();
	}
	
	public void deleteById(int id) {
		mymovie.deleteById(id);
	}
}
