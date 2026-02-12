
//import java.nio.*;
import java.util.*;


class Task{
    
    String name ;
    boolean completion ;
    String Date;
    int priorty ;
    public void completedTask(){
        completion = true ;
        priorty =0;
        
        System.out.println("Congratulations You have completed "+name+" successfully !!");
    }
     
}





public class TaskManager {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Task t1 = new Task();
    t1.Date="11/02/2026";
    t1.completion = false;
    t1.name = "Greetings";
    t1.priorty = 1;
    t1.completedTask();
    System.out.println(t1.Date);
    System.out.println(t1.name);
    System.out.println("completion status :"+t1.completion);  
    System.out.print(t1.priorty);  
    scan.close();
    }
}