package com.marekczelij;


import java.util.ArrayList;
import java.util.List;

public class Room {
    private Dimension dimension;
    //private Door door;
    //private int numberOfDoors;
    private List<Door> doorList;// = new ArrayList<Door>();
    //private Window[] windows;
    //private int numberOfWindows;
    private List<Window> windowList;// = new ArrayList<Window>();
    private boolean isAirConditioner;

    public Room(Dimension dimension, List<Door> doorList, List<Window> windowList, boolean isAirConditioner) {
        this.dimension = dimension;
        this.doorList = doorList;
        this.windowList = windowList;
        this.isAirConditioner = isAirConditioner;
    }

    public Room(Dimension dimension) {
        this(dimension,new ArrayList<Door>(),new ArrayList<Window>(),false);
    }

    public Room() {
        this(new Dimension(),new ArrayList<Door>(),new ArrayList<Window>(),false);
    }

    public int areaOfRoom()
    {
        return dimension.getX()*dimension.getY();
    }

    public int numberOfWindows()
    {
        return windowList.size();
    }

    public int numberOfDoors()
    {
        return doorList.size();
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public List<Door> getDoorList() {
        return doorList;
    }

    public void setDoorList(List<Door> doorList) {
        this.doorList = doorList;
    }

    public List<Window> getWindowList() {
        return windowList;
    }

    public void setWindowList(List<Window> windowList) {
        this.windowList = windowList;
    }

    public boolean isAirConditioner() {
        return isAirConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        isAirConditioner = airConditioner;
    }
}
