package Project;

import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while(true){
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark task as completed");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {   
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    toDoList.addTask(taskName);
                    break;
                case 2:
                    toDoList.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter task index to mark as completed: ");
                    int completedIndex = scanner.nextInt();
                    toDoList.markTaskAsCompleted(completedIndex);
                    break;
                case 4:
                    System.out.print("Enter task index to delete: ");
                    int deleteIndex = scanner.nextInt();
                    toDoList.deleteTask(deleteIndex);
                    break;
                case 5:
                    System.out.println("Exiting application...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
