package database.objects;

public class Tenant {
    public final int id;
    public final String name;

    public Tenant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {return id;}
    public String getTenantName() {return name;}
}
