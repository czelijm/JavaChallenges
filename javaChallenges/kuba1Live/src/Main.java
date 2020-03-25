import java.nio.ByteBuffer;//do zadania4
import java.util.Scanner;//do zadania3
import static java.lang.Math.*;//do zadania3

public class Main {

    public static void main(String[] args) {

        zad3();
        zad4(370208);
        zad5();
    }

    public static void zad3()
    {
        //System.out.println("Hello World!");
        //Wczytywanie liczby z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int n = scanner.nextInt();
        System.out.println("n = " + n);

        System.out.println("podpunkt A");
        int sumA=0;
        for (int i = 1; i <=n; i++) {
            sumA=sumA+(i*(i+1));
        }
        //System.out.println(sumA);
        //1*(1+1)+  2*(2+1) + 3*(3+1)
        int warunekA = (n*(n+1)*(n+2))/3;

        if (sumA==warunekA){
            System.out.println("Równe");
        }
        else{
            System.out.println("Nie równe"+ sumA+ " != "+warunekA);
        }

        System.out.println("podpunkt B");
        float sumB=0.0F;
        for (int i = 1; i <=n; i++) {
            //sumB=sumB+(1.0F/(float)pow(2.0F,(float)i));
            sumB+=(1.0F/(pow(2.0F,i)));
        }
        float warunekB = 1.0F;

        if (sumB==warunekB){
            System.out.println("Równe");
        }
        else{
            System.out.println("Nie równe "+ sumB+ " != "+warunekB);
        }

        System.out.println("podpunkt C");

        int sumC=0;
        for (int i = 1; i <=n; i++) {
            sumC+=pow(-1,(i-1))*pow(i,2);
        }
        int warunekC = (int)pow(-1,(n-1))*n*(n+1)/2;
        if (sumC==warunekC){
            System.out.println("Równe");
        }
        else{
            System.out.println("Nie równe "+ sumC+ " != "+warunekC);
        }
    }//end of zad3

    public static void zad4(int n){
        char[] charTab = {'A','R','G','B'};
        byte[] bytes = ByteBuffer.allocate(4).putInt(n).array();

//       byte[] result = new byte[4];
//        result[0] = (byte) ((n  >> 24) &  0x000000FF);
//        result[1] = (byte) ((n >> 16) & 0x000000FF);
//        result[2] = (byte) ((n >> 8) & 0x000000FF);
//        result[3] = (byte) ((n & 0x000000FF));

        for (int i = 0; i < 4; i++) {
            System.out.print(charTab[i]);
            System.out.format(" 0x%x ", bytes[i]);
            System.out.println((int)(bytes[i] & 0xff));
        }
    }//end of zad4

    public static void zad5(){
        //Wczytywanie liczby z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int n = scanner.nextInt();
        System.out.println("n = " + n);

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(alphabet[j]);
            }
            System.out.print("\n");
        }
        for(int i = n; i>=0; i--){
            for(int j = 0; j<i; j++){
                System.out.print(alphabet[j]);
            }
            System.out.print("\n");
        }


    }//end of zad5

}
