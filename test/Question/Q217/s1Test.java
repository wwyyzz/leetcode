package Question.Q217;

import org.junit.Test;

import static org.junit.Assert.*;

public class s1Test {

    @Test
    public void containsDuplicate() {
        assertEquals(true, new s1().containsDuplicate(new int[]{1,2,3,3}));
        assertEquals(false, new s1().containsDuplicate(new int[]{1,2,3,4}));
    }
}