package com.marekczelij;

public class Dimension {
    private int x;
    private int y;
    private int z;

    public Dimension(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Dimension() {
        this(0,0,0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
