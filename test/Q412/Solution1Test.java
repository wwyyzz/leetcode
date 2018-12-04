package Q412;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution1Test {


    List<String> list = Arrays.asList("1","2","Fizz","4","Buzz","Fizz",
            "7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");

    @Test
    public void fizzBuzz() {
        assertEquals(list, new Solution1().fizzBuzz(15));
    }
}