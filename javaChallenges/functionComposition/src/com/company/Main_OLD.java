package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main_OLD {

    public static void main(String[] args) {
	// write your code here
        /*<--
         *  definicja operacji w postaci lambda-wyrażeń :
         *  - flines - zwraca listę wierszy z pliku tekstowego
         *  - join - łączy napisy z listy (zwraca napis połączonych ze sobą elementów listy napisów)
         *  - collectInts - zwraca listę liczb całkowitych zawartych w napisie
         *  - sum - zwraca sumę elmentów listy liczb całkowitych
         */
        Function<String,List<String>> flines =  (s) -> new ArrayList<>(Arrays.asList(( s.split("\n"))));
        Function<List<String>,String> join =  (s) -> String.join("",s);

        Function<String, List<Integer>> collectInts = (line) -> {
            List<Integer> integers = new ArrayList<>();

            for (String s : line.replaceAll("[^\\d ]", " ").trim().split(" ")) {
                if (s.length() > 0)
                    integers.add(Integer.valueOf(s));
            }

            return integers;
        };

        Function<List<Integer>, Integer> sum = (integers) -> (integers.stream().mapToInt(i -> i).sum());


//        String fname = System.getProperty("user.home") + "/LamComFile.txt"
        String fname = "Cars:\n- Fiat: 15, Ford: 20\n- Opel: 8, Mitsubishi: 10";

        InputConverter<String> fileConv = new InputConverter<>(fname);
        //All functions must be run in one method and final result is the type of last's methods return type
        List<String> lines = fileConv.convertBy(flines);
        String linesXD = fileConv.convertBy(flines,join);

        System.out.println(fname);
        System.out.println(lines);
    }
}
