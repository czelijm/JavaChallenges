package com.marekczelij;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class ListCreator {
    private List internalList;

    public static <T> ListCreator collectFrom(List<T> list) {
        ListCreator creator = new ListCreator();
        creator.internalList = list;
        return creator;
    }

    public <T> ListCreator when(Function<T, Boolean> callback){
        List<T> tmpList = new LinkedList<T>();

        for (int i = 0; i < internalList.size(); i++) {
            internalList.get(i);
            if (callback.apply((T)(internalList.get(i))).booleanValue()) {
                tmpList.add((T)internalList.get(i));
            }
        }

        internalList=tmpList;
        return this;
    }

    public <T> ListCreator mapEvery(Function<T, T> callback){
        for (int i = 0; i < internalList.size(); i++) {
            internalList.set(i,callback.apply((T)(internalList.get(i))));
        }
        return this;
    }

    public List toList(){
        return internalList;
    }
}
