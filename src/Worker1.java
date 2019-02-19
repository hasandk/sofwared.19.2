
import java.util.Random;

public class Worker1 implements Runnable {

    Random random = new Random();

    int count = 0;

    @Override
    public void run() {
        while (count<6000) {
            System.out.println("Worker 1 kører...");
           /* try {
                Thread.sleep(random.nextInt(300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } */
            count++;
            ThreadDemo.amountOfWorkDone = ThreadDemo.amountOfWorkDone + 1;
        }
        System.out.println("Worker 1 er i mål ..");
        System.out.println("Amount of work : "+ ThreadDemo.amountOfWorkDone);
    }
}
