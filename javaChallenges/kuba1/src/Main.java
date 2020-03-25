import java.nio.ByteBuffer;//do zadania5
import java.util.Scanner;//do zadania4
import static java.lang.Math.*;//do zadania4

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        zad4();
        zad5(370208);
        zad6();
    }

    public static void zad4(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int n = scanner.nextInt();

        System.out.println("Podpunkt A");
        int sumInt=0;
        for (int i = 1; i <= n ; i++) {
            //System.out.println( (i*(i+1)));
            sumInt+=(i*(i+1));

        }
        System.out.println("Suma = "+sumInt);

        double warunekA = ((n*(n+1)*(n+2))/3);
        if((double)sumInt==warunekA){
            System.out.println("Równe");
        }
        else{
            System.out.println("Nie równe"+ sumInt+ " != "+warunekA);
        }


        System.out.println("Podpunkt B");
        float sumDouble=0.0F;
        for (int i = 1; i <= n ; i++) {
            sumDouble+=(1.0F/(pow(2.0F,i)));
        }
        System.out.println("Suma = "+sumDouble);

        float warunekB = 1.0F;
        if(sumInt==warunekB){
            System.out.println("Równe");
        }
        else{
            System.out.println("Nie równe"+ sumDouble+ " != "+warunekB);
        }


        System.out.println("Podpunkt C");
        double sumC=0.0D;
        for (int i = 1; i <= n ; i++) {
            sumC+=pow(-1,i-1)*pow(i,2);
        }
        System.out.println("Suma = "+sumC);

        double warunekC = (pow(-1,((double)n-1.0D))*n*(n+1.0D))/2.0D;

        if(sumC==warunekC){
            System.out.println("Równe");
        }
        else{
            System.out.println("Nie równe"+ sumC+ " != "+warunekC);
        }

    }

    public static void zad5(int n){
        char[] charTab = {'A','R','G','B'};
        byte[] bytes = ByteBuffer.allocate(4).putInt(n).array();

        byte[] result = new byte[4];
//
//        result[0] = (byte) ((n  >> 24) &  0x000000FF);
//        result[1] = (byte) ((n >> 16) & 0x000000FF);
//        result[2] = (byte) ((n >> 8) & 0x000000FF);
//        result[3] = (byte) ((n & 0x000000FF));

        for (int i = 0; i < 4; i++) {
            System.out.print(charTab[i]);
            System.out.format(" 0x%x ", bytes[i]);
            System.out.println((int)(bytes[i] & 0xff));
        }
//        for (byte b : result) {
//            System.out.format("0x%x ", b);
//            System.out.println((int)(b & 0xff));
//        }
    }

    public static void zad6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int n = scanner.nextInt();
        if(n>26){
            System.out.println("podałeś za dużą liczbę uruchom ponownie program");
            return;
        }
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
        for (int i = n; i > -1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }
}
