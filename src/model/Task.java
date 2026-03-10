package model;

public class Task {
    private String name;
    private String startingDate;
    private String completionDate;

    private int priority;

    /*
     * 0 for default.
     * +ve priority for normal tasks.
     */
    public Task() {
        name = null;
        startingDate = null;
        completionDate = null;

        priority = 0;

    }

    public void completedTask(String x) {
        completionDate = x;

        System.out.println("COngrataions!!! You have done it.");
    }

    public Task(String str1, String str2, int x) {
        name = str1;
        startingDate = str2;
        priority = x;
        completionDate = "not yet";
    }

    // Getters

    public String getCompletionDate() {
        return completionDate;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    // setters

    public void setName(String x) {
        name = x;
    }

    public void setStartingDate(String x) {
        startingDate = x;
    }

    public void setCompletionDate(String x) {
        completionDate = x;
    }

    public void setPriority(int x) {
        priority = x;
    }

}
