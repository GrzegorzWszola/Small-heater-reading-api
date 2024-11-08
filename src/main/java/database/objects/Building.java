package database.objects;

public class Building {
    private final int id;
    private final String address;
    private final double mainReader;

    public Building(int id, String address, double mainReader) {
        this.id = id;
        this.address = address;
        this.mainReader = mainReader;
    }

    public int getId() {return id;}
    public String getAddress() {return address;}
    public double getMainReader() {return mainReader;}
}
