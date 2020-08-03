package Question.Q442_pass;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution1Test {
//    List<Integer> list = Arrays.asList(4,3,2,7,8,2,3,1);
    List<Integer> list = Arrays.asList(2,3);

    @Test
    public void findDuplicates() {
        assertEquals(list, new Solution1().findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }
}