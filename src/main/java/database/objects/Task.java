package database.objects;

public class Task {
    private final int id;
    private final String plannedDate;

    public Task(int id, String plannedDate) {
        this.id = id;
        this.plannedDate = plannedDate;
    }

    public int getId() {return id;}
    public String getPlannedDate() {return plannedDate;}
}
