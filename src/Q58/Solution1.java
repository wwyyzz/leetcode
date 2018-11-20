package Q58;

public class Solution1 {
    public int lengthOfLastWord(String s) {
        System.out.println(s);
        System.out.println(s.lastIndexOf(" "));
        System.out.println(s.length());
        if ((s.lastIndexOf(" ") == -1 ) || (s.lastIndexOf(" ") == (s.length() - 1))){
            return s.length();
        }
        else if (s.equals(" ")) {
            return 0;
        }
        else {
            return s.length() - s.lastIndexOf(" ") - 1;
        }
    }
}
