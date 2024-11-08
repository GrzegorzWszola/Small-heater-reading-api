package database.objects;

public class TaskPerformer {
    private final int id;
    private final String name;

    public TaskPerformer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {return id;}
    public String getTaskPerformerName() {return name;}
}
