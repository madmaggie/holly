package com.movies.sync;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * Created by Rox on 08.09.2014.
 */
@Component
public class SyncFolders {

    @Value("#{propFile.masterFolder}")
    private String pathMaster;
    private MoviesFolder masterFolder;

    @Value("#{propFile.slaveFolder}")
    private String pathSlave;
    private MoviesFolder slaveFolder;

    public SyncFolders() {
        this.masterFolder = new MoviesFolder(pathMaster);
        this.masterFolder.init();
        this.slaveFolder = new MoviesFolder(pathSlave);
        this.slaveFolder.init();
    }

    public MoviesFolder getMoveToMaster() {
        MoviesFolder tempMoveToMaster = new MoviesFolder(pathMaster);
        tempMoveToMaster.init();
        tempMoveToMaster.getFolderList().retainAll(slaveFolder.getFolderList());
        return tempMoveToMaster;
    }

    public MoviesFolder getMoveToSlave() {
        MoviesFolder tempMoveToSlave = new MoviesFolder(pathMaster);
        tempMoveToSlave.init();
        tempMoveToSlave.getFolderList().retainAll(masterFolder.getFolderList());
        return tempMoveToSlave;
    }

    public MoviesFolder getMasterFolder() {
        return masterFolder;
    }

    public MoviesFolder getSlaveFolder() {
        return slaveFolder;
    }

    public void setPathMaster(String pathMaster) {
        this.pathMaster = pathMaster;
    }

    public void setPathSlave(String pathSlave) {
        this.pathSlave = pathSlave;
    }
}



