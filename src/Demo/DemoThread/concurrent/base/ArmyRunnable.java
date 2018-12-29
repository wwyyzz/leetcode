package Demo.DemoThread.concurrent.base;

/**
 * @program: leetcode
 * @description: concurrent
 * @author: Jun Wang
 * @create: 2018-12-29 10:50
 */
public class ArmyRunnable implements Runnable{

    volatile boolean keepRunning = true;

    @Override
    public void run() {
        while (keepRunning){
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " attack [" + i + "]");

                Thread.yield();
            }

        }
    }
}
