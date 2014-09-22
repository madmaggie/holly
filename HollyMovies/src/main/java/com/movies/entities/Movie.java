package com.movies.entities;

import java.nio.file.Path;
import java.util.HashSet;

/**
 * Created by Rox on 08.09.2014.
 */
public class Movie {
    String genre;
    String title;
    HashSet<Actor> actors;
    String releaseDate;


    public Movie (Path moviePath) {
        title = moviePath.getFileName().toString();
        genre = moviePath.getParent().getFileName().toString();
    }

    public void initMovie() {

    }

    public void writeMovie() {
        System.out.println("*** Title: " + title);
        System.out.println("*** Genre: " + genre);
    }
}
