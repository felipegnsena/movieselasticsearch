package com.example.demo.service;

import com.example.demo.model.Movie;

import java.util.List;

public interface MovieService {

    void saveMovie(Movie movie);

    void deleteMovie(String id);

    List<Movie> findAllMovies();
}
