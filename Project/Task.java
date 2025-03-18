package Project;

public class Task {
    private String taskname;
    private boolean isCompleted;

    public Task(String taskname){
        this.taskname = taskname;
        this.isCompleted = false;
    }

    public String getTaskname(){
        return taskname;
    }

    public void setTaskname(String taskname){
        this.taskname = taskname;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[Completed] " : "[Pending] ") + taskname;
    }
}
