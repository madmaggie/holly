package com.movies.entities;

import com.movies.sync.SyncFolders;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rox on 10.09.2014.
 */
public class MovieTests {

    SyncFolders syncTest;

    @Before
    public void generateMovie() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        syncTest = context.getBean(SyncFolders.class);
    }

    @Test
    public void calculateToBeMoved() {
        syncTest.sync();
        int result1 = syncTest.getMoveToMaster().size();
        assertEquals(2, result1);
        int result2 = syncTest.getMoveToSlave().size();
        assertEquals(2, result2);
    }
}
