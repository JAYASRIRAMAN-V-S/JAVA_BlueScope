package Project;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;

    public ToDoList(){
        this.tasks = new ArrayList<>();
    }

    public void addTask(String taskName){
        Task task = new Task(taskName);
        tasks.add(task);
    }

    public void viewTasks(){
        if(tasks.isEmpty()){
            System.out.println("No tasks to display");
        } else {
            tasks.forEach(task -> System.out.println(task));
        }
    }

    public void markTaskAsCompleted(int taskIndex){
        if(taskIndex >= 0 && taskIndex < tasks.size()){
            tasks.get(taskIndex).markAsCompleted();
        } else {
            System.out.println("Invalid task index");
        }
    }

    public void deleteTask(int taskIndex){
        if(taskIndex >= 0 && taskIndex < tasks.size()){
            tasks.remove(taskIndex);
        } else {
            System.out.println("Invalid task index");
        }
    }

}
