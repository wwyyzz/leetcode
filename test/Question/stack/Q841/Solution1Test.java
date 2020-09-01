package Question.stack.Q841;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void canVisitAllRooms() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1));
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(3));
        list.add(Arrays.asList());


        assertEquals(true, new Solution1().canVisitAllRooms(list));
    }

    @Test
    public void canVisitAllRooms2() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,3));
        list.add(Arrays.asList(3,0,1));
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(0));


        assertEquals(false, new Solution1().canVisitAllRooms(list));
    }
}