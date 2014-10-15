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
    private Set<Movie> moveToMaster;

    @Value("#{propFile.slaveFolder}")
    private String pathSlave;
    private Set<Movie> moveToSlave;

    public void sync() {
        initMoveToMaster
    }

    public MoviesFolder initMoveToMaster() {
        return FileUtils.createFolderList(pathToMaster, FileUtils.generateFolderList(pathToMaster));
    }

    public MoviesFolder initMoveToSlave() {
        return FileUtils.createFolderList(pathToMaster, FileUtils.generateFolderList(pathToMaster));
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



