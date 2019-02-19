import java.util.Random;

public class Worker2 implements Runnable{


    Random random = new Random();

    int count = 0;

    @Override
    public void run() {
        while (count <60000) {
            System.out.println("Worker 2 kører...");
          /*  try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } */
            count++;
            ThreadDemo.amountOfWorkDone = ThreadDemo.amountOfWorkDone + 1;
        }
        System.out.println("Worker 2 er i mål ..");
        System.out.println("Amount of work : "+ ThreadDemo.amountOfWorkDone);
    }
}
