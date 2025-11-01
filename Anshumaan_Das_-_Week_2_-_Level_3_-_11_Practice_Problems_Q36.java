import java.util.Timer;
import java.util.TimerTask;

public class W2L3Q36 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 0;
            @Override
            public void run() {
                count++;
                System.out.println("Timer executed " + count + " times.");
                if (count >= 5) {
                    timer.cancel();
                    System.out.println("Timer stopped.");
                }
            }
        };
        timer.schedule(task, 0, 1000); // Every 1 second
    }
}