import java.util.Timer;
import java.util.TimerTask;

public class W2L2Q35 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Timer executed");
                timer.cancel();
            }
        }, 1000);
    }
}