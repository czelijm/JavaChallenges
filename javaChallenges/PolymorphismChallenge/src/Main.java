import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Car {
    private String name;
    private int numberOfCylinders;
    private int numberOfWheels;
    private boolean isEngineWorkingProperly;

    public Car(String name, int numberOfCylinders, int numberOfWheels, boolean isEngineWorkingProperly) {
        this.name = name;
        this.numberOfCylinders = numberOfCylinders;
        this.numberOfWheels = numberOfWheels;
        this.isEngineWorkingProperly = isEngineWorkingProperly;
    }

    public Car(String name, int numberOfCylinders) {
        this(name, numberOfCylinders, 4, true);
    }

    public void startEngine(){
        System.out.println("Engine ON!!!");
    }

    public void accelerate(){
        System.out.println("accelerate!!!");
    }

    public void brake(){
        System.out.println("brake!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isEngineWorkingProperly() {
        return isEngineWorkingProperly;
    }

    public void setEngineWorkingProperly(boolean engineWorkingProperly) {
        isEngineWorkingProperly = engineWorkingProperly;
    }
}

class Toyota extends Car {
    public Toyota(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }

    @Override
    public void startEngine(){
        System.out.println("Hajime TOYOTA!!!");
    }

    @Override
    public void accelerate(){
        System.out.println("Hayamemasu!!!");
    }

    @Override
    public void brake(){
        System.out.println("Burēki!!!");
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }

    @Override
    public void startEngine(){
        System.out.println("Hajime MITSUBISHI!!!");
    }

    @Override
    public void accelerate(){
        System.out.println("Hayamemasu!!!");
    }

    @Override
    public void brake(){
        System.out.println("Burēki!!!");
    }
}

class Lamborgini extends Car {
    public Lamborgini(String name, int numberOfCylinders) {
        super(name, numberOfCylinders);
    }
    @Override
    public void startEngine(){
        System.out.println("motore acceso LAMBORGINI!!!");
    }

    @Override
    public void accelerate(){
        System.out.println("accelerare!!!");
    }

    @Override
    public void brake(){
        System.out.println("freno!!!");
    }

}



public class Main {

    public static void main(String[] args) {


//      System.out.println("Hello World!");

        List<Car> carList = new ArrayList<Car>();

        carList.add(new Toyota("AE86",4));
        carList.add(new Mitsubishi("Lancer Evoloution VI",4));
        carList.add(new Lamborgini("Murcielago",12));



        System.out.println("STAGE 1");
        //classic loop
        for(int car=0; car<carList.size();car++ )
        {
            System.out.println(carList.get(car).getName());
            carList.get(car).startEngine();
        }

        System.out.println("STAGE 2");
        //for each loop
        for (Car car:carList) {
            System.out.println(car.getName());
            car.accelerate();

        }


        //Iterators, they start "before first element", we must think that the first element in the list is next
        System.out.println("STAGE 3");
        //iterator
//Ok, easy way
//        Iterator<Car> carListIterator = carList.iterator();
//        while (carListIterator.hasNext()){
//            Car tempCar = carListIterator.next();
//            System.out.println(tempCar.getName());
//            tempCar.brake();
//        }

        for(Iterator<Car> carListIterator = carList.iterator();carListIterator.hasNext();) {
            Car tempCar = carListIterator.next();
            System.out.println(tempCar.getName());
            tempCar.brake();
        }

        System.out.println("STAGE 4");
        //listIterator
        ListIterator<Car> carListListIterator = carList.listIterator();
        while (carListListIterator.hasNext()){
            Car tempCar = carListListIterator.next();
            System.out.println(tempCar.getName());
            tempCar.accelerate();
        }

        System.out.println("STAGE 5, Java 8 Style");
        carList.forEach(car -> System.out.println(car.getName()));
        carList.forEach(car -> car.brake());

        System.out.println("FINAL STAGE? Java 8 Style Again");
        carList.stream().forEach(car -> System.out.println(car.getName()));
        carList.stream().forEach(car -> car.accelerate());

    }
}
