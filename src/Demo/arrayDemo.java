package Demo;

import java.util.Arrays;
import java.util.List;

public class arrayDemo {
    public static void main(String[] args) {

//        默认初始化
//        int array = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
//        char array = [ ,  ,  ,  ,  ,  ,  ,  ,  ,  ]
//        String array = [null, null, null, null, null, null, null, null, null, null]
        int[] a1 = new int[10];
        char[] a2 = new char[10];
        String[] a3 = new String[10];


//        Arrays转字符串，借助Arrays.toString()静态方法
        System.out.println("int array = " + Arrays.toString(a1));
        System.out.println("char array = " + Arrays.toString(a2));
        System.out.println("String array = " + Arrays.toString(a3));
        System.out.println("-------------------------------------" );
//        批量填充arrays的元素
        Arrays.fill(a1,9);
        Arrays.fill(a2,'a');
        Arrays.fill(a3,"Hello");

//        部分填充
        Arrays.fill(a1,4,9,8);
        Arrays.fill(a2,4,9,'z');
        Arrays.fill(a3,4,9,"World");


        System.out.println("int array = " + Arrays.toString(a1));
        System.out.println("char array = " + Arrays.toString(a2));
        System.out.println("String array = " + Arrays.toString(a3));
        System.out.println("-------------------------------------" );

        int[] a4 = {13,16,9,12,4,6,18,1,0,5};
        char[] a5 = {'b','x','c','a','t','q','s','p','0'};
        String[] a6 = {"cca","111","q","bbb","ccc"};

        System.out.println("int array = " + Arrays.toString(a4));
        System.out.println("char array = " + Arrays.toString(a5));
        System.out.println("String array = " + Arrays.toString(a6));
        System.out.println("-------------------------------------" );

        Arrays.sort(a4);
        Arrays.sort(a5);
        Arrays.sort(a6);

//        Arrays.sort(a4,4,9);
//        Arrays.sort(a5,2,5);
//        Arrays.sort(a6,2,5);

        System.out.println("int array = " + Arrays.toString(a4));
        System.out.println("char array = " + Arrays.toString(a5));
        System.out.println("String array = " + Arrays.toString(a6));
        System.out.println("-------------------------------------" );

        int[] a7 = Arrays.copyOf(a4, 10);
        char[] a8 = Arrays.copyOf(a5, 5);
        String[] a9 = Arrays.copyOf(a6, 5);

        System.out.println("int array = " + Arrays.toString(a7));
        System.out.println("char array = " + Arrays.toString(a8));
        System.out.println("String array = " + Arrays.toString(a9));
        System.out.println("-------------------------------------" );

        System.out.println(Arrays.equals(a4, a7));
        System.out.println(Arrays.equals(a4, a1));

        int[] a10 = Arrays.copyOfRange(a4, 3,8);
        char[] a11 = Arrays.copyOfRange(a5, 3,8);
        String[] a12 = Arrays.copyOfRange(a6, 3,8);
        System.out.println("int array = " + Arrays.toString(a10));
        System.out.println("char array = " + Arrays.toString(a11));
        System.out.println("String array = " + Arrays.toString(a12));
        System.out.println("-------------------------------------" );

        int[] a13 = new int[8];
        System.arraycopy(a4, 0,a13,0,8);
        System.out.println("int array = " + Arrays.toString(a13));
        System.out.println("-------------------------------------" );

        System.out.println(Arrays.binarySearch(a4, 5));
        System.out.println("-------------------------------------" );

        System.out.println(Arrays.hashCode(a4));

        Integer[] a14 = {13,16,9,12,4,6,18,1,0,5};
        List l1 = Arrays.asList(a14);
        System.out.println(l1.toString());
        System.out.println("-------------------------------------" );

        for (int i = 0; i < a14.length; i++) {
            Integer integer = a14[i];
            integer *= integer;
            System.out.println(integer);
        }

        for (Object o : l1) {
            System.out.println(o);
        }

        for (int i = 0; i < l1.size(); i++) {
            Object o =  l1.get(i);
            
        }



        

    }
}
