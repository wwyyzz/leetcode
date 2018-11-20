package Q66;

import org.junit.Test;

import static org.junit.Assert.*;

public class s1Test {

    @Test
    public void plusOne() {
        assertArrayEquals(new int[]{1,2,4} ,new s1().plusOne(new int[]{1,2,3}));
        assertArrayEquals(new int[]{1,0} ,new s1().plusOne(new int[]{9}));
        assertArrayEquals(new int[]{1,3,0} ,new s1().plusOne(new int[]{1,2,9}));
        assertArrayEquals(new int[]{3,0,0,0} ,new s1().plusOne(new int[]{2,9,9,9}));

    }
}