package com.marekczelij;

public class Window {
    private Dimension dimension;
    private boolean isOpen;

    public Window(Dimension dimension, boolean isOpen) {
        this.dimension = dimension;
        this.isOpen = isOpen;
    }

    public Window() {
        this(new Dimension(),false);
    }

    private void openWindow()
    {
        this.isOpen = true;
    }

    private void closeWindow()
    {
        this.isOpen = false;
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
}
