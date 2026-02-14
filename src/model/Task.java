package src.model;

public class Task {
    String name;
    String startingDate;
    String completionDate;
    boolean runningTask;
    int priorty;

    /*
     * 0 for default.
     * +ve priority for normal tasks.
     */
    public Task(){
         name=null;
     startingDate = null;
     completionDate = null;
     runningTask = false;
    priorty = 0;

    }
    public void completedTask(String x) {
        completionDate = x;
        runningTask = false;

        System.out.println("COngrataions!!! You have done it.");
    }

    public Task(String str1, String str2, int x) {
        name = str1;
        startingDate = str2;
        priorty = x;
        completionDate = "not yet";
    }

    public Task(String str1, String str2, int x, boolean n) {
        name = str1;
        startingDate = str2;
        priorty = x;
        runningTask = true;
        completionDate = "not yet";
    }

    public void show() {
        System.out.println(
                "Task : " + name + "\n" + "starting Date : " + startingDate + "\nCompletion date :" + completionDate);
    }
      //    Getters


    public String getCompletionDate() {
        return completionDate;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public String getName() {
        return name;
    }
    public int getPriority(){
        return priorty;
    }
        

    // setters

    public void setName(String x){
        name = x;
    }
    public void startingDate(String x){
        startingDate = x;
    }
    public void setcompletionDate(String x){
        completionDate = x;
    }
public void setPriority(int x ){
        priorty =x ;
    }

}

