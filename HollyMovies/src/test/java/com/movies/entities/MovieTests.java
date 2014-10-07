package com.movies.entities;

import com.movies.sync.SyncFolders;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rox on 10.09.2014.
 */
public class MovieTests {

    SyncFolders sync;

    @Before
    public void generateMovie() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        sync = context.getBean(SyncFolders.class);
    }

    public void displaySyncMovieFolders(int displayCounter) {
        System.out.println(displayCounter + "--------------------------------------");
        sync.getMasterFolder().printFileList();
        System.out.println("---------------------------------------------");
        sync.getSlaveFolder().printFileList();
   }

    public void displaySyncToBeMoved(int displayCounter) {
        System.out.println(displayCounter + "--------------------------------------");
        sync.getMoveToMaster().printFileList();
        System.out.println("---------------------------------------------");
        sync.getMoveToSlave().printFileList();
    }

    @Test
    public void calculateToBeMoved() {
        displaySyncMovieFolders(1);
        displaySyncToBeMoved(2);
    }
}
