package Q15;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void threeSum() {
        List<List<Integer>> a = new ArrayList<>();
        a.add(Arrays.asList(-1,0,1));
        a.add(Arrays.asList(-1,-1,2));
        System.out.println(a);
        assertEquals(a,new Solution1().threeSum(new int[]{-1,0,1,2,-4}));
        assertEquals(a,new Solution1().threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}