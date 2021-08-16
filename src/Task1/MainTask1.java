package Task1;

public class MainTask1 {
    public static void main(String[] args) {
        TimeThread timeThread = new TimeThread();

        try {
            while (!timeThread.thread.isInterrupted()) {
                if (timeThread.isDeadTime()) {
                    System.out.println("Прошло 5 секунд");
                    timeThread.setDeadTime(false);
                }
            }
            timeThread.thread.interrupt();
            System.out.println("end");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
