import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---- To-Do List Menu ----");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;

                case 2:
                    System.out.print("Enter task to remove: ");
                    String removeTask = sc.nextLine();
                    if (tasks.remove(removeTask)) {
                        System.out.println("Task removed!");
                    } else {
                        System.out.println("Task not found!");
                    }
                    break;

                case 3:
                    StringBuffer sb = new StringBuffer();
                    sb.append("---- Your Tasks ----\n");

                    if (tasks.isEmpty()) {
                        sb.append("No tasks added yet.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            sb.append(i + 1).append(". ").append(tasks.get(i)).append("\n");
                        }
                    }
                    System.out.println(sb.toString());
                    break;

                case 4:
                    System.out.println("Exiting To-Do List. Bye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}