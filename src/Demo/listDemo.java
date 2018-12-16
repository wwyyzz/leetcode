package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listDemo {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(4);
        l1.add(3);
//        l1.add("hi");

        display(l1);

//        l1.clear();
//        display(l1);

//        增加元素
        l1.add(0,9);
        display(l1);

//        删除元素
        l1.remove(3);
        display(l1);

//        修改元素
        l1.set(0, 8);
        display(l1);

//        查找元素
        System.out.println(l1.contains(8));
        System.out.println(l1.contains(9));

        int n1 = l1.get(3);
        System.out.println("n1 =" + n1);

        System.out.println("l1.indexOf(2) = " + l1.indexOf(2));

        System.out.println("-------------------------------------" );

        System.out.println("subList = " + l1.subList(2, 4));


        System.out.println(Arrays.toString(l1.toArray()));

    }

    private static void display(List<Integer> list ){
        System.out.println(list);
        System.out.println("-------------------------------------" );
    }
}
