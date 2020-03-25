package marek;

public class Main {

    public static void main(String[] args)
    {
        Hatchback ct200h = new Hatchback(200,"car","lexus","CT200h","Hybrid","Petrol",100);

        ct200h.startEngine();
        ct200h.move();

        Car tarpan = new Car(100,"pickup","Honker","Tarpan","2,1 L SV M-20 R4","Petrol");

        tarpan.move();

        Vehicle timeMachine = new Vehicle(135,"awesome");

        timeMachine.move();

    }

}
