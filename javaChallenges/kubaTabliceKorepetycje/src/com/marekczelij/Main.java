package com.marekczelij;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array = {3, 4, 1, 8, 9, 10, 7};

        int minimalElements = 5;
        task1(array, minimalElements);

        int[][] tab = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        task2(tab);
    }

    public static void task1(int[] array, int minimalElements){

        if(minimalElements>=array.length){
            minimalElements=array.length;
        }

        //sortowanie z tablicy {10,99,0,8}-->{0,8,10,99}, metoda, która sortuje
        //kolejność elementów w tablicy
        Arrays.sort(array);

        int suma = 0;
        for (int i=0; i<minimalElements;i++) {
            suma = suma + array[i];
        }
        System.out.println(suma);
        return;
    }
    public static void task2(int[][] array2D) {
    /*
      tablica 2d, kwadratowa
      zał. tablica jest już posortowana rosnąco tak jak w przykładzie, to pozwala nam na  nie przeszukiwanie całej tablicy, tylko pierwszej kolumny i pierwszego rzędu
      utworzyć i wuświetlać nową tablice 1d
      minimalne wartości z każdego wiersza, każdej kolumny
      oraz przekątnych (obu)
    */
        //ilość rzędów czyli ilość wszystkich tablic1D w tablicy2D +
        //ilość elemntów w tablicy1D -> ilość kolumn w macierzy kwadratowej /talica 2d kwadratowa/+
        //mamy 2 przekątne, dlatego 2
        // int[] tab1D = new int[ilośćElementów] np. new int[10]
        //int[] array1D = new int[4 + 4 + 2];
        int[] array1D = new int[array2D.length + array2D[0].length + 2];
        System.out.println(array1D.length);
        // |[][][][][][][][][][]

        for (int i=0;i<array2D.length ;i++) {
            array1D[i]=array2D[i][0];
        }
        // [x][x][x][x]|[][][][][][]

        for (int i=0; i<array2D[0].length; i++) {
            array1D[array2D.length+i]=array2D[0][i];
        }
        //              4+0,4+1,4+2, 4+3
        // [x][x][x][x][x] [x]  [x]  [x]|[][]

        array1D[array2D.length + array2D[0].length]=array2D[0][0];
        //                         4+4  4+4+1
        // [x][x][x][x][x][x][x][x][x]|[]

        array1D[array2D.length + array2D[0].length+1]=array2D[0][3];

        for (int i=0;i<array1D.length ;i++ ) {
            System.out.println(array1D[i]);
        }

        return;
    }



}






/*

  {4,  7,  1,  8}
  {10, 20, 35, 1}
  {50, 70, 1,  0}
  {30, 7,  3,  50}

*/

//wzgl rzędówh
  /*
  {1,  4,  7,  8}
  {1,  10, 20, 35}
  {0,  50, 70, 1}
  {3,  7,  30,  50}
*/

/*
{0,  4,  7,  1}
{1,  7, 20, 8}
{1,  10, 30, 35}
{3,  50,  70,  50}
*/


