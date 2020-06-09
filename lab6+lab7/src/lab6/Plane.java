package lab6;

public class Plane {
    private String name;
    private int loadCapacity; //вантажопідйомність: тонн кг
    private int roominess; //місткість: к-ть пасажирів
    private int flightRange; //дальністю польоту: тисяч кілометрів
    private int fuelConsumption; //споживання пального: літрів в годину

    public Plane(String name, int loadCapacity, int roominess, int flightRange, int fuelConsumption) {
        this.name = name;
        this.loadCapacity = loadCapacity;
        this.roominess = roominess;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getRoominess() {
        return roominess;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
