package Demo.DemoThread;

/**
 * @program: leetcode
 * @description: Concurrent
 * @author: Jun Wang
 * @create: 2018-12-29 10:18
 */
public class Actor extends Thread{

    @Override
    public void run() {
        System.out.println(getName() + " I am a actor!");
        int count = 0;
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println(getName() + " play " + (++count) + " times.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 100){
                keepRunning = false;
            }

            if (count % 10 == 0){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(getName() + "'s play is over!");
    }

    public static void main(String[] args) {
        Thread actor = new Actor();
        actor.setName("Mr.Thread");

        actor.start();

        Thread actress = new Thread(new Actress(), "Ms. Runnable");
        actress.start();
    }
}

class Actress implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " I am a actor!");
        int count = 0;
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println(Thread.currentThread().getName() + " play " + (++count) + " times.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (count == 100){
                keepRunning = false;
            }

            if (count % 10 == 0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(Thread.currentThread().getName() + "'s play is over!");
    }
}
