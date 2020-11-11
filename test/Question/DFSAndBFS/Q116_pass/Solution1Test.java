package Question.DFSAndBFS.Q116_pass;

import Question.Node;
import org.junit.Test;

public class Solution1Test {

    @Test
    public void connect() {
        Node n7 = new Node(7);
        Node n6 = new Node(6);
        Node n5 = new Node(5);
        Node n4 = new Node(4);
        Node n3 = new Node(3,n6,n7,null);
        Node n2 = new Node(2,n4,n5,null);
        Node n1 = new Node(1,n2,n3,null);

        new Solution1().connect(n1);


    }
}