package service;

import model.Task;
import java.util.*;
import java.io.*;

public class TaskManager   {
    List<Task> tasks = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void createTask() {
        System.out.println("enter name of the task: \n");
        String na = sc.nextLine();

        System.out.println("enter priority:\n");
        int temp = sc.nextInt();
        sc.nextLine();

        System.out.println("enter Starting date:\n");
        String st = sc.nextLine();

        Task g = new Task(na, st, temp);
        tasks.add(g);
    }

    public void createTasks() {

        System.out.println("Enter no of Tasks :\n");
        int nu = sc.nextInt();
        sc.nextLine();
        if (nu == 1) {
            createTask();
        } else {
            for (int i = 1; i <= nu; i++) {
                System.out.printf(" %dth Task : \n ",i);
                createTask();
            }
        }

    }

    public void deleteTask() {
        System.out.println(" enter name of Task\n");
        String temp = sc.nextLine();
        Iterator<Task> it = tasks.iterator();
        while (it.hasNext()) {
            Task task = it.next();
            if (task.getName().equals(temp)) {
                it.remove();
            }
        }
        
    }
    public void saveTasksToFile() {

    tasks.sort(Comparator.comparingInt(Task::getPriority));

    try {
        FileWriter fw = new FileWriter("tasks.txt");

        for (Task t : tasks) {

            fw.write(String.format(
                "%-20s %-20s %-20s %5d\n",
                t.getName(),
                t.getStartingDate(),
                t.getCompletionDate(),
                t.getPriority()
            ));

        }

        fw.close();
        System.out.println("Tasks saved.");

    } catch (IOException e) {
        System.out.println("File error.");
    }
}
    
}
