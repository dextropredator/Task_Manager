

package app;
import model.*;
class Main{
    public static void main(String[] args) {
        Task t1 = new Task("Test", "09/02/2026", 1) ;
        t1.show();
        t1.setCompletionDate("14/02/2026");
        t1.show();
        t1.completedTask("09/03/2026");
        t1.show();
    }
}