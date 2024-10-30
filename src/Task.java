public class Task {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String description;
    private String status;

    public Task(String name, String description) {
        this.id = idCounter++;
        this.name = name;
        this.description = description;
        this.status = "Pending"; // Default status
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task ID: " + id + ", Name: " + name + ", Description: " + description + ", Status: " + status;
    }
}
