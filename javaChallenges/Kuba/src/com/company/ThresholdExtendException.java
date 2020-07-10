package com.company;

public class ThresholdExtendException extends Exception{
    public ThresholdExtendException(){
        super();
    }

    public ThresholdExtendException(String message){
        super(message);
    }

    public ThresholdExtendException(String message, Throwable error){
        super(message,error);
    }

}
