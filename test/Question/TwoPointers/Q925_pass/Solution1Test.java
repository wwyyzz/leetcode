package Question.TwoPointers.Q925_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isLongPressedName() {
        String name = "leelee";
        String typed ="lleeelee";

        assertTrue(new Solution1().isLongPressedName(name, typed));
    }

    @Test
    public void isLongPressedName2() {
        String name = "alex";
        String typed ="aaleex";

        assertTrue(new Solution1().isLongPressedName(name, typed));
    }

    @Test
    public void isLongPressedName3() {
        String name = "saeed";
        String typed ="ssaaedd";

        assertFalse(new Solution1().isLongPressedName(name, typed));
    }

    @Test
    public void isLongPressedName4() {
        String name = "laiden";
        String typed ="laiden";

        assertTrue(new Solution1().isLongPressedName(name, typed));
    }

    @Test
    public void isLongPressedName5() {
        String name = "vtkgn";
        String typed ="vttkgnnn";

        assertTrue(new Solution1().isLongPressedName(name, typed));
    }

    @Test
    public void isLongPressedName6() {
        String name = "vtkgn";
        String typed ="vttkgnnnnnl";

        assertFalse(new Solution1().isLongPressedName(name, typed));
    }

    @Test
    public void isLongPressedName7() {
        String name = "pyplrz";
        String typed ="ppyypllr";

        assertFalse(new Solution1().isLongPressedName(name, typed));
    }
}