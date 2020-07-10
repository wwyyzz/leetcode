package Question.Q824;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void toGoatLatin() {
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", new Solution1().toGoatLatin("I speak Goat Latin"));
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", new Solution1().toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}