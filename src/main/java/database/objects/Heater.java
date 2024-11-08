package database.objects;

public class Heater {
    private final int id;
    private final double reading;

    public Heater(int id, double reading) {
        this.id = id;
        this.reading = reading;
    }

    public int getId() {return id;}
    public double getReading() {return reading;}
}
