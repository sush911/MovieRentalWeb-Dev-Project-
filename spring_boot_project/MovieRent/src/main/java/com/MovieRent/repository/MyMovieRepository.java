package com.MovieRent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MovieRent.entity.MyMovieList;

@Repository
public interface MyMovieRepository extends JpaRepository<MyMovieList,Integer>{

}
