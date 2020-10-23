package Interview.Q0103;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void replaceSpaces() {
        String S = "Mr John Smith    ";
        new Solution1().replaceSpaces(S, 13);
    }

    @Test
    public void replaceSpaces2() {
        String S = "               ";
        new Solution1().replaceSpaces(S, 5);
    }

    @Test
    public void replaceSpaces3() {
        String S = "               ";
        new Solution1().replaceSpaces(S, 5);
    }

    @Test
    public void replaceSpaces4() {
        String S = "ds sdfs afs sdfa dfssf asdf             ";
        new Solution1().replaceSpaces(S, 27);
    }
}