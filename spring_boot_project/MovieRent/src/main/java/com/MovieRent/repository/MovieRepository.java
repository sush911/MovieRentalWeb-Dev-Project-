package com.MovieRent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MovieRent.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer>  {

}
