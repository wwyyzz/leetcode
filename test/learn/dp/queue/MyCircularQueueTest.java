package learn.dp.queue;

import learn.queue.MyCircularQueue;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyCircularQueueTest {
    static MyCircularQueue queue = new MyCircularQueue(3);



    @Test
    public void enQueue() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
    }

    @Test
    public void deQueue() {
        System.out.println(queue.Rear());
    }

    @Test
    public void front() {
    }

    @Test
    public void rear() {
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void isFull() {
    }
}