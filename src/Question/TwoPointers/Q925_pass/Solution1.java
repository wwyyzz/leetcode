/**
 925. 长按键入
 你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。

 你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。

 示例 1：
 输入：name = "alex", typed = "aaleex"
 输出：true
 解释：'alex' 中的 'a' 和 'e' 被长按。

 示例 2：
 输入：name = "saeed", typed = "ssaaedd"
 输出：false
 解释：'e' 一定需要被键入两次，但在 typed 的输出中不是这样。

 示例 3：
 输入：name = "leelee", typed = "lleeelee"
 输出：true

 示例 4：
 输入：name = "laiden", typed = "laiden"
 输出：true
 解释：长按名字中的字符并不是必要的。

 提示：
 name.length <= 1000
 typed.length <= 1000
 name 和 typed 的字符都是小写字母。

 */

package Question.TwoPointers.Q925_pass;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了86.83%的用户
 内存消耗：
 36.6 MB, 在所有 Java 提交中击败了76.19%的用户
 */
public class Solution1 {
    public boolean isLongPressedName(String name, String typed) {
        boolean result = true;

        char last;
        int i = 0;
        int j = 0;

        if (name.charAt(0) != typed.charAt(0)) {
            return false;
        }

        while (i < name.length() && j < typed.length() ) {
//            last = typed.charAt(j);
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                result = false;
                break;
            }
        }

        while (j < typed.length()) {
            if (typed.charAt(j) != typed.charAt(j - 1)) {
                result = false;
                break;
            }
            j++;
        }

        System.out.println("i ==" + i);
        System.out.println("j ==" + j);

        return i == name.length() && result;

    }
}
