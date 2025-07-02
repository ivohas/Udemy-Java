public class Task {
    private String name;
    private boolean completed;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
        this.completed = false;
    }

    public String getName() { return name; }
    public int getPriority() { return priority; }
    public boolean isCompleted() { return completed; }
    public void complete() { this.completed = true; }

    @Override
    public String toString() {
        return name + " [priority=" + priority + ", completed=" + completed + "]";
    }
}
