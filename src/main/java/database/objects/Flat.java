package database.objects;

public class Flat {
    private final int id;
    private final int number;

    public Flat(int id, int number) {
        this.id = id;
        this.number = number;

    }

    public int getId() {return id;}
    public int getNumber() {return number;}
}
