package kuba;

public class MyExampleClass {

    public static void main(String[] args){

//        for (int licznik = 1; licznik<=1000;){
//            System.out.println("Hello world");
//            licznik=licznik+1;
//        }
//
//        for (int licznik = 1; licznik<=1000;){
//            System.out.println("Hello world");
//            //licznik=licznik+1;
//        }

//        Scanner scan = new Scanner(System.in);
//        //System.out.println("Jak masz na imię?");
//        //String firstName = scan.nextLine();
//
//        ///System.out.println("Witaj " + firstName);
//
//
//
//        for (int licznik = 1; licznik<=3;){
//            System.out.println("Podaj liczbę");
//            int liczba = scan.nextInt();
//            System.out.println("Podałeś liczbę " + liczba);
//            licznik=licznik+1;
//        }

        int[] mojaTablica = {10, 20, 30, 40};

        String[] tablicaString = {"24 Nowe Bemowo", "20 Boernerowo", "555 Donikąd"};


        //zaczynamy "odliczanie" od 0
        //pierwszy element to 0
        //drugi to 1
        //itp
        System.out.println("Pierwsza liczba w tabilcy to " + mojaTablica[0]);
        System.out.println("Druga liczba w tabilcy to " + mojaTablica[1]);
        System.out.println("trzecia liczba w tabilcy to " + mojaTablica[2]);
        System.out.println("Czwarta liczba w tabilcy to " + mojaTablica[3]);


       // licznik=licznik+1;
       // licznik++;

       // licznik = liczniki+5;
       // licznik+=5;


        for (int licznik = 0; licznik<4;){
            System.out.println("liczba w tabilcy to " + mojaTablica[2]);
            licznik=licznik+1;
        }

        for (int licznik = 0; licznik<3;){
            System.out.println("następny tramwaj to " + tablicaString[licznik]);
            licznik=licznik+1;
        }

        for (int licznik = 2; licznik>-1;){
            System.out.println("następny tramwaj to " + tablicaString[licznik]);
            licznik=licznik-1;
        }


        int[][] macierz = { {5,20,70},
                            {34,7,63},
                            {33,84,53}
         };


        int[] tab1 = {1, 2, 3};

        int[][] tabliczaTablic = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3}};


        System.out.println("1 tablica 2 liczba " + macierz[0][1] );

        System.out.println("2 tablica 1 liczba " + macierz[1][0] );

        System.out.println("3 tablica druga liczba " + macierz[2][1]);



        int[] abc = {7,35,68,43,62,2,5};


        for (int licznik = 0; licznik<7;licznik++){
            System.out.println(abc[licznik]);
        }

        for (int licznik = 0; licznik<7;licznik+=2){
            System.out.println(abc[licznik]);
        }
        for (int licznik = 1; licznik<7;licznik+=2){
            System.out.println(abc[licznik]);
        }

        for (int licznik = 6; licznik>-1;licznik--){
            System.out.println(abc[licznik]);
        }

        for (int licznik = 6; licznik>-1;licznik-=2){
            System.out.println(abc[licznik]);
        }

        int[][] macierzabc = {{2,67,23,75},{38,74,3,84},{64,83,27,8}};




    }
}
