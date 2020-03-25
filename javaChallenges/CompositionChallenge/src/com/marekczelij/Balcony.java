package com.marekczelij;

public class Balcony {
    private Dimension dimension;

    public Balcony(Dimension dimension) {
        this.dimension = dimension;
    }

    public Balcony() {
        this(new Dimension());
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
