package marek;

public class Car extends Vehicle{

    private String vendorName;
    private String modelName;
    private String engineType;
    private String fuelType;

    public Car() {
        this(0, "UNKNOWN", "UNKNOWN", "UNKNOWN", "UNKNOWN", "UNKNOWN");
    }

    public Car(String vendorName, String modelName, String engineType, String fuelType) {
        this(0, "UNKNOWN",vendorName, modelName, engineType, fuelType);
    }

    public Car(int speed, String vehicleType, String vendorName, String modelName, String engineType, String fuelType) {
        super(speed, vehicleType);
        this.vendorName = vendorName;
        this.modelName = modelName;
        this.engineType = engineType;
        this.fuelType = fuelType;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void move()
    {
        super.move();
        System.out.println("Car moved");
    }

    public void startEngine()
    {
        System.out.println("Engine started");
    }


}
