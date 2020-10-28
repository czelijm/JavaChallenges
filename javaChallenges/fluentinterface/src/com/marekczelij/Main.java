package com.marekczelij;

import java.util.*;

public class Main {

    static List<String> getPricesInPLN(List<String> destinations, double xrate) {
        return  ListCreator.collectFrom(destinations)
                .when( (String x)->(x.split(" ")[0].toUpperCase()).equals("WAW")
                                //substring(0,2).toUpperCase().equals("WAW")
                /*<-- lambda wyrażenie
                 *  selekcja wylotów z Warszawy (zaczynających się od WAW)
                 */
                )
                .mapEvery(
                        (String x)->{
                            // Double.toString(Double.parseDouble(x.split(" ")[2])/xrate)
                            var tmpArray = x.split(" ");
                            var result = Integer.toString( (int)(Double.parseDouble(tmpArray[tmpArray.length-1])*xrate));
                            tmpArray[tmpArray.length-1]=result;
                            return String.join(" ",tmpArray);
                        }
                )
                /*<-- lambda wyrażenie
                 *  wyliczenie ceny przelotu w PLN
                 *  i stworzenie wynikowego napisu
                 */
                .toList();
    }

    public static void main(String[] args) {
        // Lista destynacji: port_wylotu port_przylotu cena_EUR
        List<String> dest = Arrays.asList(
                "bleble bleble 2000",
                "WAW HAV 1200",
                "xxx yyy 789",
                "WAW DPS 2000",
                "WAW HKT 1000"
        );
        double ratePLNvsEUR = 4.30;
        List<String> result = getPricesInPLN(dest, ratePLNvsEUR);
        for (String r : result) System.out.println(r);
    }
}