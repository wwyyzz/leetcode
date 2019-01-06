package Demo.DemoThread.demoTicket;

class MyThread extends Thread{
    private int ticketsCount =5;

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        while (ticketsCount > 0) {
            ticketsCount--;

            System.out.println(name + " sell 1 ticket, left " + ticketsCount);
        }
    }
}


public class TicketThread {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("client1");
        MyThread mt2 = new MyThread("client2");
        MyThread mt3 = new MyThread("client3");
//        Thread th1 = new Thread(mt1);
//        Thread th2 = new Thread(mt1);
//        Thread th3 = new Thread(mt1);

        mt1.start();
        mt2.start();
        mt3.start();
//        th1.start();
//        th2.start();
//        th3.start();
    }
}
