

package app;

import service.TaskManager;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== TASK MANAGER =====");
            System.out.println("1. Create Tasks");
            System.out.println("2. Delete Task");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    manager.createTasks();
                    break;

                case 2:
                    manager.deleteTask();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid option.");
                    
            }
            sc.close();
        }

       
    }
}