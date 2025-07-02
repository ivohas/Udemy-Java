import java.util.*;
import java.util.function.*;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task t) {
        tasks.add(t);
    }

    public void printTasks() {
        tasks.forEach(System.out::println); // method reference
    }

    public void filterTasks(Predicate<Task> condition) {
        tasks.stream()
                .filter(condition)
                .forEach(t -> System.out.println("Filtered: " + t));
    }

    public void sortTasks() {
        tasks.sort(
                Comparator.comparing(Task::getPriority) // method reference
                        .thenComparing(Task::getName)
        );
    }

    public void completeAll(Consumer<Task> action) {
        tasks.forEach(action); // use lambda or method ref
    }

    public List<String> getTaskNames(Function<Task, String> mapper) {
        List<String> names = new ArrayList<>();
        tasks.forEach(t -> names.add(mapper.apply(t)));
        return names;
    }
}
