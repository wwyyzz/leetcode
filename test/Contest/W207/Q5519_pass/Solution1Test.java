package Contest.W207.Q5519_pass;

import junit.framework.TestCase;
import org.junit.Test;

public class Solution1Test extends TestCase {

    @Test
    public void testReorderSpaces() {
        String text = "  this   is  a sentence ";
        String result = "this   is   a   sentence";
        assertEquals(result, new Solution1().reorderSpaces(text));
    }

    @Test
    public void testReorderSpaces2() {
        String text = " practice   makes   perfect";
        String result = "practice   makes   perfect ";
        assertEquals(result, new Solution1().reorderSpaces(text));
    }

    @Test
    public void testReorderSpaces3() {
        String text = "hello   world";
        String result = "hello   world";
        assertEquals(result, new Solution1().reorderSpaces(text));
    }

    @Test
    public void testReorderSpaces4() {
        String text = "a";
        String result = "a";
        assertEquals(result, new Solution1().reorderSpaces(text));
    }

    @Test
    public void testReorderSpaces5() {
        String text = "  hello";
        String result = "hello  ";
        assertEquals(result, new Solution1().reorderSpaces(text));
    }
}