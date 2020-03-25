package com.marekczelij;


import java.util.ArrayList;
import java.util.List;

public class Series {


    public static List<Integer> nSum(int n){

        int sum=0;
        List<Integer> factorialList=new ArrayList<>();

        for (int i=0;i<=n;i++){
            sum+=i;
            factorialList.add(Integer.valueOf(sum));

        }

        return factorialList;
    }

    public static void showFactorialList(List<Integer> list){
        for (Integer i:list
             ) {
            System.out.println(i);

        }
    }

}
