package com.example.demo.service.impl;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void saveMovie(Movie movie) {
        this.movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(String id) {
        this.movieRepository.deleteById(id);
    }

    @Override
    public List<Movie> findAllMovies() {
        Iterable<Movie> iterable = this.movieRepository.findAll();
        List<Movie> movies = new ArrayList<>();
        iterable.forEach(movies::add);
        return movies;
    }
}
