public class HelloWord {

    public static void main(String args[])
    {

        System.out.println("Hello Za WARDO!!!");
        System.out.println( );

        double pounds =5.0D;
        double  onePoundisKilograms = 0.45359237D;
        double kilograms = pounds*onePoundisKilograms;

        System.out.println(kilograms);

        char regiteredChar = '\u00AE';

        System.out.println(regiteredChar);

        boolean isCar = false;

        boolean wasCar = isCar ? true : false;

        boolean wasntCar = isCar ? false: true;


        System.out.println("was car "+wasCar+"\nwasn't car "+wasntCar);

        double num1 = 20.0D;
        double num2 = 80.0D;
        double num3 = (num1+num2)*25;
        System.out.println(num3);
        if ( (num3%40)<=20)
            System.out.println("Total was over the limit");
    }



}
