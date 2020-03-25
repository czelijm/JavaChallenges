package com.marekczelij;

public class Number {
    int x;
    public void setValue(int w){
        x = w;
    }
    public void showValue(){
        System.out.println(x);
    }

    public Number(int a){
        setValue(a);
        showValue();
    }

    public Number(){
        setValue(0);
        showValue();
    }


//    public Number(int x) {
//        this.x = x;
//    }


}
