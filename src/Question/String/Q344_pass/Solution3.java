/**

 */

package Question.String.Q344_pass;

/**

 */
public class Solution3 {
    public String reverseString(String s) {
        String result ="";
        return result;
    }

    private void helper(int index, String s) {
        if (s == null || index >= s.length()) {
            return;
        }

        helper(index + 1, s);
    }
}
