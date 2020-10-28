package Question.HashTable.Q599_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void findRestaurant() {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};

        new Solution1().findRestaurant(list1,list2);
    }

    @Test
    public void findRestaurant2() {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};

        new Solution1().findRestaurant(list1,list2);
    }
}