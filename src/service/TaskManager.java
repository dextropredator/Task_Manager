package service;

import model.Task;
import java.util.*;

class TaskManager  {
    List<Task> tasks = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void createTask() {
        System.out.println("enter name of the task: \n");
        String na = sc.next();
        System.out.println("enter priority:\n");
        int temp = sc.nextInt();
        System.out.println("enter Starting date:\n");
        String st = sc.next();
        Task g = new Task(na, st, temp);
        tasks.add(g);
    }

    void createTasks() {

        System.out.println("Enter no of Tasks :\n");
        int nu = sc.nextInt();
        if (nu == 1) {
            createTask();
        } else {
            for (int i = 1; i >= nu; i++) {
                System.out.printf(" %dth Task :  ",i);
                createTask();
            }
        }

    }

    void deleteTask() {
        System.out.println(" enter name of Task");
        String temp = sc.next();
        Iterator<Task> it = tasks.iterator();

        while (it.hasNext()) {
            Task task = it.next();
            if (task.getName().equals(temp)) {
                it.remove();
            }
        }
    }
}