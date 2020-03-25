package marek;

public class Hatchback extends Car{

    private int trunkSize;

    public Hatchback(String vendorName, String modelName, String engineType, String fuelType, int trunkSize) {
        this(0, "UNKNOWN", "UNKNOWN", "UNKNOWN", "UNKNOWN", "UNKNOWN", trunkSize);
    }

    public Hatchback() {
        this(0, "UNKNOWN", "UNKNOWN", "UNKNOWN", "UNKNOWN", "UNKNOWN",0);
    }

    public Hatchback(int speed, String vehicleType, String vendorName, String modelName, String engineType, String fuelType, int trunkSize) {
        super(speed, vehicleType, vendorName, modelName, engineType, fuelType);
        this.trunkSize = trunkSize;
    }

    public int getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(int trunkSize) {
        this.trunkSize = trunkSize;
    }

    public void hatchbackON()
    {
        System.out.println("Hatchback ON!");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Hatchback moved");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        hatchbackON();
    }
}
