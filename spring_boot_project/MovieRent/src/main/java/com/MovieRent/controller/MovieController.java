package com.MovieRent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.MovieRent.entity.Movie;
import com.MovieRent.entity.MyMovieList;
import com.MovieRent.service.MovieService;
import com.MovieRent.service.MyMovieListService;

import java.util.List;

@Controller
public class MovieController {

	@Autowired
	private MovieService service;

	@Autowired
	private MyMovieListService myMovieService;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/movie_register")
	public String movieRegister() {
		return "movieRegister";
	}

	@GetMapping("/available_movies")
	public ModelAndView getAllMovie() {
		List<Movie> list = service.getAllMovie();
		return new ModelAndView("movieList", "movie", list);
	}

	@PostMapping("/save")
	public String addMovie(@ModelAttribute Movie b) {
		service.save(b);
		return "redirect:/available_movies";
	}

	@GetMapping("/my_movies")
	public String getMyBooks(Model model) {
		List<MyMovieList> list = myMovieService.getAllMyMovies();
		model.addAttribute("movie", list);
		return "myMovies";
	}

	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Movie b = service.getMovieById(id);


		MyMovieList mb = new MyMovieList(b.getId(), b.getName(), b.getGenre(), b.getPrice().toString());

		myMovieService.saveMyMovies(mb);
		return "redirect:/my_movies";
	}

	@RequestMapping("/editMovie/{id}")
	public String editMovie(@PathVariable("id") int id, Model model) {
		Movie b = service.getMovieById(id);
		model.addAttribute("movie", b);
		return "movieEdit";
	}

	@RequestMapping("/deleteMovie/{id}")
	public String deleteBook(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/available_movies";
	}
}
