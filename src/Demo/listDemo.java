package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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

        System.out.println("-------------------------------------" );
        //        遍历元素
        for (int i = 0; i < l1.size(); i++) {
            Integer integer =  l1.get(i);
            l1.set(i, integer * 2);
        }
        display(l1);

        for (Integer integer : l1) {
            System.out.println("list1 = " + integer);
        }

        Iterator<Integer> iter = l1.iterator();

        while (iter.hasNext()){
            System.out.println("list1 = " + iter.next());
        }

        List<String> l2 = new ArrayList<>();
        l2.add("Amy");
        l2.add("Bob");
        l2.add("Carl");

        Iterator iter2 = l2.iterator();
        System.out.println(iter2.next());
        System.out.println(iter2.next());
        iter2.remove();

        System.out.println(l2);

    }

    private static void display(List<Integer> list ){
        System.out.println(list);
        System.out.println("-------------------------------------" );
    }
}
