import Task1.TimeThread;
import Task2.ChangeFromThread;

public class Main {
    public static void main(String[] args) {
 //--------------------------------------Task1

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

 //---------------------------------------Task2

       /* ChangeFromThread change = new ChangeFromThread(19);
        Thread threadA = new Thread(() -> {
            while (change.getCount() <= change.getLimit()) {
               change.buzz();
            }
        });
        Thread threadB = new Thread(() -> {
            while (change.getCount() <= change.getLimit()) {
                change.fizz();
            }
        });
        Thread threadC = new Thread(() -> {
            while (change.getCount() <= change.getLimit()) {
               change.number();
            }
        });
        Thread threadD = new Thread(() -> {
            while (change.getCount() <= change.getLimit()) {
                change.fizzbuzz();
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        while (threadA.isAlive() && threadB.isAlive() && threadC.isAlive() && threadD.isAlive()){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(change.getResult());*/
    }
}
