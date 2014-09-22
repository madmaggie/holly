package com.movies.entities;

import com.movies.sync.MoviesFolder;
import com.movies.sync.SyncFolders;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Rox on 10.09.2014.
 */
public class MovieTests {

    @Before
    public void generateMovie() {

    }

    public void displaySyncMovieFolders(int displayCounter) {
        System.out.println(displayCounter + "--------------------------------------");
        SyncFolders.getMasterFolder().printFileList();
        System.out.println("---------------------------------------------");
        SyncFolders.getSlaveFolder().printFileList();
   }

    public void displaySyncToBeMoved(int displayCounter) {
        System.out.println(displayCounter + "--------------------------------------");
        SyncFolders.getMoveToMaster().printFileList();
        System.out.println("---------------------------------------------");
        SyncFolders.getMoveToSlave().printFileList();
    }

    @Test
    public void calculateToBeMoved() {
    //    displaySyncMovieFolders(1);
        SyncFolders.calculateMovedMovies();
        displaySyncToBeMoved(2);
    }
}
