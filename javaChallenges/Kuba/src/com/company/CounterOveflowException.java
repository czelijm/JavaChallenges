package com.company;

public class CounterOveflowException  extends Exception{

    public CounterOveflowException(){
        super();
    }

    public CounterOveflowException(String message){
        super(message);
    }

    public CounterOveflowException(String message, Throwable error){
        super(message,error);
    }
}
