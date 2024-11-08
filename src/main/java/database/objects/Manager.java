package database.objects;

public class Manager {
    private final int id;
    private final String name;

    public Manager(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {return id;}
    public String getManagerName() {return name;}
}
