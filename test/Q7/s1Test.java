package Q7;

import org.junit.Test;

import static org.junit.Assert.*;

public class s1Test {

    @Test
    public void reverse() {
        assertEquals(123, new s1().reverse(321));
        assertEquals(-123, new s1().reverse(-321));
        assertEquals(9646324351, new s1().reverse(1534236469));


    }
}