import java.util.Arrays;

public class Height {

    public static void main(String[] args)
    {
        System.out.println(Centimeteers2Inches(174));
        System.out.println(Arrays.toString(Centimeteers2FeetAndInches(174)));
        System.out.println(InchesAndFeet2Centimeteers(5,8.5));
        System.out.println(InchesAndFeet2Centimeteers(68.50));


        return;
    }

    public static double InchesAndFeet2Centimeteers(double feet, double inches)
    {
        if ( inches<0 && inches>12 )
        {
            System.out.println("incorrect value of inches");
            return -1;
        }

        if ( feet<0 )
        {
            System.out.println("incorrect value of feet");
            return -1;
        }

        return 2.54D*(12*feet + inches);
    }

    public static double InchesAndFeet2Centimeteers(double inches)
    {
        double[] A =Inches2FeetAndInches(inches);
        return InchesAndFeet2Centimeteers( A[0], A[1] );
    }

    public static double Centimeteers2Inches(double cm)
    {
        if ( cm<0)
        {
            System.out.println("incorrect value of inches");
            return -1;
        }

        return cm/2.54D;
    }

    public static double[] Centimeteers2FeetAndInches(double cm)
    {
        int feet = (int)(cm/30.48D);
        double inches = Centimeteers2Inches(cm) - 12D*(double)feet;

        double[] array = {(double)feet,inches};
        return array;
    }

    public static double[] Inches2FeetAndInches(double inches)
    {
        int feet = (int)(inches/12D); //inches % 12;
        double inches1 = inches - 12D*(double)feet;

        double[] array = {(double)feet,inches1};
        return array;
    }

}

//Class created meanwhile attending in java course
