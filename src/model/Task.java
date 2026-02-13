package src.model;

public class Task {
    String name;
    String startingDate;
    String completionDate;
    boolean runningTask;
    int priorty;

    /*-ve for completed tasks without disturbing old priority.
    0 for always running tasks.
    +ve priority for normal tasks.
    */
    public void completedTask() {
        if (priorty < 0) {
            System.out.println("Task already Completed.\n Have a Great Day!");
        } else if (priorty == 0) {
            System.out.println("Have Patience Mate .\nThis shouldn't end like this always carry on.\n");
        } else {
            priorty = -1 * priorty;
            runningTask = false;
            System.out.println("Congractulations !! You have done it .");
        }
    }

}
