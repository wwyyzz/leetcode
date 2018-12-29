package Demo.DemoThread.concurrent.base;

/**
 * @program: leetcode
 * @description: keyperson
 * @author: Jun Wang
 * @create: 2018-12-29 11:12
 */
public class KeyPersonThread extends Thread {

    public void run(){
        System.out.println(Thread.currentThread().getName() + "starting attack!");

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "ATTACK!!!");
            
        }

        System.out.println(Thread.currentThread().getName() + " attack is over!");
    }
}
