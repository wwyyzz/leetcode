package Demo.DemoThread.demoTicket;

class MyRunnable implements Runnable{
    private int ticketsCount =500;

//    private String name;
//
//    public MyRunnable(String name) {
//        this.name = name;
//    }

    @Override
    public void run() {

        while (ticketsCount > 0) {
            ticketsCount--;

            System.out.println(Thread.currentThread().getName() + " sell 1 ticket, left " + ticketsCount);
        }
    }
}

public class TicketRunnable {
    public static void main(String[] args) {
        MyRunnable mt = new MyRunnable();
        Thread th1 = new Thread(mt);

        Thread th2 = new Thread(mt);

        Thread th3 = new Thread(mt);

        th1.start();
        th2.start();
        th3.start();
    }
}
