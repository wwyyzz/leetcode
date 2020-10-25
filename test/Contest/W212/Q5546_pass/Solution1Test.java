package Contest.W212.Q5546_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void slowestKey() {
        int[] releaseTimes ={9, 29, 49, 50};
        String keysPressed = "cbcd";

        assertEquals('c', new Solution1().slowestKey(releaseTimes, keysPressed));
    }

    @Test
    public void slowestKey2() {
        int[] releaseTimes ={12,23,36,46,62};
        String keysPressed = "spuda";

        assertEquals('a', new Solution1().slowestKey(releaseTimes, keysPressed));
    }

    @Test
    public void slowestKey3() {
        int[] releaseTimes ={28, 65, 97};
        String keysPressed = "gaf";

        assertEquals('a', new Solution1().slowestKey(releaseTimes, keysPressed));
    }
}