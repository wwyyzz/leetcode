package Question.Q217;

import org.junit.Test;

import static org.junit.Assert.*;

public class s1Test {

    @Test
    public void containsDuplicate() {
        assertTrue(new s1().containsDuplicate(new int[]{1, 2, 3, 3}));
        assertFalse(new s1().containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}