package Question.Array.Q406;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void reconstructQueue() {
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};

        new Solution1().reconstructQueue(people);
    }
}