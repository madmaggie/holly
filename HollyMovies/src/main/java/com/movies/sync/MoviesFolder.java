package com.movies.sync;

import com.movies.entities.Movie;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;

/**
 * Created by Rox on 08.09.2014.
 */
public class MoviesFolder {

    String sourcePath;

    HashSet<Movie> folderList = new HashSet<Movie>();

     public MoviesFolder(String path) {
        sourcePath = path;
    }

    public void init() {
        createFileList();
    }

    private void createFileList() {
        try (DirectoryStream<Path> movieDir = Files.newDirectoryStream(Paths.get(sourcePath))) {
            for (Path folder: movieDir) {
                folderList.add(new Movie(folder));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printFileList() {
        for (Movie movie: folderList) {
                movie.writeMovie();
        }
    }

    public HashSet<Movie> getFolderList() {
        return folderList;
    }
}
