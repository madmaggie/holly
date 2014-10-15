package com.movies.entities;

import java.nio.file.Path;
import java.util.HashSet;

/**
 * Created by Rox on 08.09.2014.
 */
public class Movie {
    String path;
    String title;
    String genre;
    HashSet<Actor> actors;
    String releaseDate;

    public Movie (Path completeMoviePath) {
        title = completeMoviePath.getFileName().toString();
        genre = completeMoviePath.getParent().getFileName().toString();
    }
    
    public Movie (String myTitle) {
        title = myTitle;
    }

    public boolean equals(Movie other) {
        if (!super.equals(other)) {
            return false;
        }
        if (title.equals(other.title)) {
            return true;
        }
        else return false;
    }
    
    public int hashCode() {
        return (int) title.charAt(0);
    }

    public void writeMovie() {
        System.out.println("*** Title: " + title);
        System.out.println("*** Genre: " + genre);
    }
}
