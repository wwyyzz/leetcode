package learn.queue;

import java.util.ArrayList;
import java.util.List;

public class MyCircularQueue {
    private int head ;
    private int tail ;
    private List<Integer> data ;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new ArrayList<>(k);
        head = 0;
        tail = 0;
        System.out.println(data);
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        data.add(value);
        tail++;
        System.out.println(data.toString());
        System.out.println("head :" + head);
        System.out.println("tail :" + tail);

        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {

        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        return data.get(head);
    }

    /** Get the last item from the queue. */
    public int Rear() {
        System.out.println("head :" + head);
        System.out.println("tail :" + tail);
        System.out.println(data.get(tail - 1));
        return data.get(tail - 1);
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if (head > tail){
            return false;
        }

        return true;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if (head > tail){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
        circularQueue.enQueue(1);  // 返回 true
        circularQueue.enQueue(2);  // 返回 true
        circularQueue.enQueue(3);  // 返回 true
        circularQueue.enQueue(4);  // 返回 false，队列已满
        System.out.println(circularQueue.data);
        circularQueue.Rear();  // 返回 3
//        circularQueue.isFull();  // 返回 true
//        circularQueue.deQueue();  // 返回 true
//        circularQueue.enQueue(4);  // 返回 true
//        circularQueue.Rear();  // 返回 4
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
