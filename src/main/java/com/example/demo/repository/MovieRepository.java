package com.example.demo.repository;

import com.example.demo.model.Movie;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends ElasticsearchRepository<Movie, String> {

}
