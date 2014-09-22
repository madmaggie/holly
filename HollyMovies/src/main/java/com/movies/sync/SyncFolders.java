package com.movies.sync;

import com.movies.entities.Movie;
import com.sun.corba.se.impl.orbutil.concurrent.Sync;

import java.util.HashSet;

/**
 * Created by Rox on 08.09.2014.
 */
public class SyncFolders {

    private static MoviesFolder masterFolder;

    private static MoviesFolder slaveFolder;

    private static MoviesFolder moveToMaster;

    private static MoviesFolder moveToSlave;

    private static void initSyncFolders() {
        masterFolder = new MoviesFolder();
        slaveFolder  = new MoviesFolder();
        moveToMaster = new MoviesFolder();
        moveToSlave = new MoviesFolder();
        masterFolder.init("C:\\Users\\Rox\\Desktop\\Filme");
        slaveFolder.init("D:\\MadMaggie\\PIM\\Company\\Safe\\Filme\\1_Fantasia");
        moveToMaster.init(masterFolder.sourcePath);
        moveToSlave.init(slaveFolder.sourcePath);
    }

    public static void calculateMovedMovies() {
        initSyncFolders();
        MoviesFolder tempMoveToMaster = new MoviesFolder();
        MoviesFolder tempMoveToSlave = new MoviesFolder();
        tempMoveToMaster.init(masterFolder.sourcePath);
        tempMoveToSlave.init(slaveFolder.sourcePath);
        tempMoveToSlave.getFolderList().retainAll(moveToMaster.getFolderList());
        tempMoveToMaster.getFolderList().retainAll(moveToSlave.getFolderList());
        tempMoveToSlave  = null;
        tempMoveToMaster = null;
    }

    public static void moveFile() {

    }

    public static void setMasterFolder(MoviesFolder masterFolder) {
        SyncFolders.masterFolder = masterFolder;
    }

    public static void setSlaveFolder(MoviesFolder slaveFolder) {
        SyncFolders.slaveFolder = slaveFolder;
    }

    public static MoviesFolder getMoveToMaster() {
        return moveToMaster;
    }

    public static MoviesFolder getMoveToSlave() {
        return moveToSlave;
    }

    public static MoviesFolder getMasterFolder() {
        return masterFolder;
    }

    public static MoviesFolder getSlaveFolder() {
        return slaveFolder;
    }
}



