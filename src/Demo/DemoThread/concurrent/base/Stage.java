package Demo.DemoThread.concurrent.base;

/**
 * @program: leetcode
 * @description: stage
 * @author: Jun Wang
 * @create: 2018-12-29 10:56
 */
public class Stage extends Thread{


    public void run(){
        ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
        ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();

        Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty,"sui");
        Thread armyOfRevolt = new Thread(armyTaskOfRevolt, "qiyijun");

        armyOfSuiDynasty.start();
        armyOfRevolt.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        armyTaskOfSuiDynasty.keepRunning = true;
        armyTaskOfRevolt.keepRunning = true;

        try {
            armyOfRevolt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread mrCheng = new KeyPersonThread();
        mrCheng.setName("ChengYaoJing");

        System.out.println("cheng's idea is over the war");

        armyTaskOfSuiDynasty.keepRunning = false;
        armyTaskOfRevolt.keepRunning = false;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mrCheng.start();

        try {
            mrCheng.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("War is over!");
        System.out.println("play is over");
    }

    public static void main(String[] args) {
        new Stage().start();

    }
}
