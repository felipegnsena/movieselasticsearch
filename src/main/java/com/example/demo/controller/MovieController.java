package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveMovie(@RequestBody Movie movie) {
        System.out.println(movie.toString());
        movieService.saveMovie(movie);
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public List<Movie> findAllMovies() {
        return movieService.findAllMovies();
    }
}
