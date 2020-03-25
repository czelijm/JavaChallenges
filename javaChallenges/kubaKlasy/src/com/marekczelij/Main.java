package com.marekczelij;

import java.awt.font.NumericShaper;

public class Main {

    public static void main(String[] args) {
	// write your code here
//
//        Dom mojdom = new Dom();
//        mojdom.sonia.dajGlos();

        Number number =new Number();
        number.setValue(5); //tutaj sami zmieniamy wartość
        number.showValue();
        System.out.println(number.x);

        MethodCurrier mC = new MethodCurrier();
        mC.setValue(number);

        Number number1 = new Number();
        //nie trzeba tych metod już bo są w konstruktorze

        Number number2 = new Number(3);

    }


}
