public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("Learn Lambdas", 2));
        manager.addTask(new Task("Write Code", 1));
        manager.addTask(new Task("Take Break", 3));

        System.out.println("All Tasks:");
        manager.printTasks();

        System.out.println("\nSorting by priority...");
        manager.sortTasks();
        manager.printTasks();

        System.out.println("\nUncompleted Tasks:");
        manager.filterTasks(t -> !t.isCompleted()); // lambda

        System.out.println("\nCompleting all tasks...");
        manager.completeAll(Task::complete); // method reference

        System.out.println("\nTask Names:");
        manager.getTaskNames(Task::getName).forEach(System.out::println); // method ref
    }
}
