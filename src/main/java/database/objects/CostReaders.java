package database.objects;

public class CostReaders {
    private final int id;
    private final String realDateOfFinishing;

    public CostReaders(int id, String realDateOfFinishing, String taskPerformer) {
        this.id = id;
        this.realDateOfFinishing = realDateOfFinishing;
    }

    public int getId() {return id;}
    public String getRealDateOfFinishing() {return realDateOfFinishing;}
}
