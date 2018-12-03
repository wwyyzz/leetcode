package Q415;

import java.util.Arrays;

public class Solution1 {
    String addStrings(String num1, String num2) {
        String temp = "";


        if (num1.length() < num2.length()){
            String s = num1;
            num1 = num2;
            num2 = s;
        }

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        int len_a = num1.length();
        int len_b = num2.length();

        char[] arr22 = new char[len_a];
        Arrays.fill(arr22,(char)(48));
        System.out.println((char)(48));
        System.out.println(arr22);

        System.arraycopy(arr2, 0, arr22, len_a - len_b + 0, len_b);

        System.out.println(arr1);
        System.out.println(arr22);

        char[] arr3 = new char[len_a];
        for (int i = len_a - 1; i <= 0; i--) {
            arr3[i] = (char)(arr3[i] + arr1[i] + arr2[i] - 48 );
            if (arr3[i] > 57) {
                arr3[i] -= 10;
                arr3[i-1] += 1;
            }
        }

//
        String s = new String(arr3);
        System.out.println(s);
        return s;
    }
}
