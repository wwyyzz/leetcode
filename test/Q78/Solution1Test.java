package Q78;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void subsets() {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(Arrays.asList());
        result.add(Arrays.asList(1));
        result.add(Arrays.asList(2));
        result.add(Arrays.asList(3));
        result.add(Arrays.asList(1,2));
        result.add(Arrays.asList(1,3));
        result.add(Arrays.asList(2,3));
        result.add(Arrays.asList(1,2,3));

        assertEquals();
    }
}