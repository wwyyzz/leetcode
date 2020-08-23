package Question.string.Q344_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class s1Test {

    @Test
    public void reverseString() {
        assertEquals("olleh", new s1().reverseString(new String("hello")));
        assertEquals("amanaP :lanac a ,nalp a ,nam A", new s1().reverseString(new String("A man, a plan, a canal: Panama")));

        assertEquals("olleh", new s2().reverseString(new String("hello")));
        assertEquals("amanaP :lanac a ,nalp a ,nam A", new s2().reverseString(new String("A man, a plan, a canal: Panama")));

    }
}