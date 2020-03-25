package marek;

public class Vehicle {
    private int speed;
    private String vehicleType;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle() {
        this(0,"UNKNOWN");
    }

    public Vehicle(int speed, String vehicleType) {
        this.speed = speed;
        this.vehicleType = vehicleType;
    }

    public void move()
    {
        System.out.println("Vehicle moved");
    }
}
