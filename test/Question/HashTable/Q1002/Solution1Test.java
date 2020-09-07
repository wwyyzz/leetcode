package Question.HashTable.Q1002;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void commonChars() {
        String[] A = {"bella","label","roller"};
        new Solution1().commonChars(A);
    }

    @Test
    public void commonChars2() {
        String[] A = {"cool","lock","cook"};
        new Solution1().commonChars(A);
    }
}