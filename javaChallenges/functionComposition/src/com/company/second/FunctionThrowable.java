package com.company.second;

import java.util.function.Function;

public interface FunctionThrowable<T,R> extends Function<T,R> {

    R call(T r) throws Exception;

    @Override
    default R apply(T r){

        try {
            return (R) call(r);
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}
