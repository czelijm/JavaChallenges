package com.marekczelij;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Maybe<T> {
    T x = null;

    public static <R> Maybe<R> of(R x) {
        return new Maybe<R>(x);
    }

    public void ifPresent(Consumer cons){
        if(isPresent()){
            cons.accept(x);
        }
    }

    public <R> Maybe<R> map(Function<T,R> func){
        if(isPresent()){
//            R r = func.apply(x);
            return of(func.apply(x));
        }
        return new Maybe<>(null);
    }

    public T get(){
//        try {
        if(isPresent()) return x;
        throw new NoSuchElementException("Maybe is empty");
//        } catch ( NoSuchElementException e){
//            e.printStackTrace();
//            System.out.println("NoSuchElementException");
//        }
//        return null;
    }

    boolean isPresent() {return x!=null && !x.equals(null);}

    T orElse(T defVal){
        return isPresent() ? x : defVal;
    }

     Maybe<T> filter(Predicate<T> pred){
        if(pred.equals(x) || !isPresent()){
            System.out.println("XDXD");
        }
        return pred.test(x) || !isPresent()? this : new Maybe<>();
    }

    private Maybe(T x) {
        this.x = x;
    }

    private Maybe() {
        new Maybe(null);
    }

    @Override
    public String toString() {
        return isPresent()? "Maybe has value " + x : "Maybe is empty";
    }
}
