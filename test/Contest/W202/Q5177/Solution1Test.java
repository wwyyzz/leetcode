package Contest.W202.Q5177;

import org.junit.Test;

public class Solution1Test {
    String date1 = "20th Oct 2052";
    String date2 = "375357th Oct 2052";

    @Test
    public void reformatDate() {
        new Solution1().reformatDate(date1);
        new Solution1().reformatDate(date2);

    }
}