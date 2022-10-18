package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "movie")
public class Movie {

    @Id
    private String id;

    @Field(name = "title")
    private String title;
}
