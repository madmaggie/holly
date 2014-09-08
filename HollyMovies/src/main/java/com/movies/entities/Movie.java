package com.movies.entities;

import java.nio.file.Path;
import java.util.HashSet;

/**
 * Created by Rox on 08.09.2014.
 */
public class Movie {
    String path;
    String genre;
    String title;
    HashSet<Actor> actors;
    String releaseDate;


    public Movie (Path movie) {
        title = movie.toString();
    }

    public void writeMovie() {
        
    }
}
