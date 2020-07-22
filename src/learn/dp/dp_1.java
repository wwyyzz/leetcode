package learn.dp;

import java.util.HashMap;
import java.util.Map;

public class dp_1 {

    public static int fibonacci_1(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return fibonacci_1(n - 1) + fibonacci_1(n - 2);
    }

    public static int fibonacci_2(int n) {

        Map map = new HashMap<>();
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (map.get(n) != null)  {
            return (int) map.get(n);
        }
        int result = fibonacci_2(n - 1) + fibonacci_2(n - 2);
        map.put(n, result);
        return result;

    }

    public static int fibonacci_3(int n) {

        Map map = new HashMap<>();
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (map.get(n) != null)  {
            return (int) map.get(n);
        }
        int result = fibonacci_3(n - 1) + fibonacci_3(n - 2);
        map.put(n, result);
        return result;

    }
}
