package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        System.out.println("XD");
        try {
            CounterMy licznik = new  CounterMy(20);
            licznik.setCurrentValue(10);
            licznik.setCurrentValue(1000);
            Detector czujnik = new Detector(50);
            czujnik.setCurrentValue(20);
            czujnik.setCurrentValue(60);
            int a = 20;
            int b = 0;
            int c = a/b;
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);

        } catch ( FileNotFoundException e){
            System.out.println("Nie znaleziono pliku");
//            System.out.println("Exception thrown  :" + e);
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }        //lapanie naszego wyjatku
        catch(CounterOveflowException e){
            System.out.println("Licznik przepelniony");
        } catch (ThresholdExtendException e){
            System.out.println(e);
        }

    }

}
