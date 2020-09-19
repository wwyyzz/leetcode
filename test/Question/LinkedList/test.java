package Question.LinkedList;

public class test {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode head = node1;
        while (head != null) {
            System.out.println("node :" + head.val);
            head = head.next;
        }

        head = node1;
        while (head.next != null) {
//            System.out.println("node :" + head.val);
            if (head.next.val == 3) {
                head.next = head.next.next;
            }
            head = head.next;


        }

        head = node1;
        while (head != null) {
            System.out.println("node :" + head.val);
            head = head.next;
        }

        System.out.println(head);

    }
}
