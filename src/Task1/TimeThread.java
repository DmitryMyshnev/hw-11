package Task1;

import java.text.SimpleDateFormat;

public class TimeThread implements Runnable {
    private boolean deadTime;
    public Thread thread;

    public TimeThread() {
        thread = new Thread(this);
        deadTime = false;
        thread.start();
    }

    public boolean isDeadTime() {
        return deadTime;
    }

    public void setDeadTime(boolean deadTime) {
        this.deadTime = deadTime;
    }

    public  void run() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        int count = 0;
        long curentTime = System.currentTimeMillis();
        while (!Thread.currentThread().isInterrupted()) {
            if ((System.currentTimeMillis() - curentTime) >= 1000) {
                curentTime = System.currentTimeMillis();
                System.out.println(formatter.format(System.currentTimeMillis()));
                if (++count == 5) {
                    deadTime = true;
                    count = 0;
                }
            }
        }
    }
}
