package List.BasicsOperations;

import java.util.ArrayList;
import java.util.List;

public class TasksLists {

    // attributes

    private final List<Tasks> tasksList;

    public TasksLists() {
        this.tasksList = new ArrayList<>();
    }

    public void addTask(String description){
        tasksList.add(new Tasks(description));
    }

    public void removeTasks(String description){

      List<Tasks> tasksToRemove = new ArrayList<>();
      for(Tasks t : tasksList){
          if(t.getDescription().equalsIgnoreCase(description)){
              tasksToRemove.add(t);
          }
      }
      tasksList.removeAll(tasksToRemove);
    }

    public int unitTotalTasks(){

        return tasksList.size();
    }

    public void obtainTasksDescription(){

        System.out.println(tasksList);
    }

    public static void main(String[] args) {

        TasksLists tasksLists = new TasksLists();
        System.out.println("Número de elementos na lista: " + tasksLists.unitTotalTasks());

        tasksLists.addTask("Tarefa 1");
        System.out.println("Número de elementos na lista: " + tasksLists.unitTotalTasks());

        tasksLists.addTask("Tarefa 1");
        System.out.println("Número de elementos na lista: " + tasksLists.unitTotalTasks());

        tasksLists.obtainTasksDescription();
    }
}
