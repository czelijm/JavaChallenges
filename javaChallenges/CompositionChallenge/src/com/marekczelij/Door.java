package com.marekczelij;

public class Door {
    private Dimension dimension;
    private String color;
    private boolean isOpen;

    public Door(Dimension dimension, String color, boolean isOpen) {
        this.dimension = dimension;
        this.color = color;
        this.isOpen = isOpen;
    }

    private void openDoor()
    {
        this.isOpen = true;
    }

    private void closeDoor()
    {
        this.isOpen = false;
    }

    public Door() {
        this(new Dimension(),"white",false);
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
