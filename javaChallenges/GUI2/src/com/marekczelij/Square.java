package com.marekczelij;

public class Square implements Comparable<Square>{
    private int id;
    private int length;
    private static int counter=0;

    public Square(int length) {
        this.length = length;
        this.id=this.counter;
        this.counter++;
    }

    public int getArea(){
        return this.length*this.length;
    }

    @Override
    public String toString() {
        return String.format("length= "+this.length+" id= "+this.id);
    }

    @Override
    public int compareTo(Square o) {
        return Integer.compare(this.length,o.length);
    }
}
