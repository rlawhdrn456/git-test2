package com.java.test;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("zz");
        System.out.println("zz");
        System.out.println(5/(float)2);

        int[] arrays = new int[5];
        arrays[0] = 1;

        System.out.println("배열 test");
        System.out.println(arrays[0]);

        int[][] array6 = {{1}, {2,3}, {4,5,6}};

        System.out.println(array6[1][1]);


        String str1 = new String("Hello world");
        String str2 = new String("Hello world");

        if( str1.equals(str2) ){
            System.out.println("str1과 str2는 같은 값을 가지고 있습니다.");
        }
        else{
            System.out.println("str1과 str2는 다른 값을 가지고 있습니다.");
        }

        int x = 5;
        int y = 10;
        System.out.println(x + y + "zz"+y + x);


        String syr = "hello";

        String syr2 = "hello";

        syr = "zzz";
        System.out.println(syr2.substring(2,2));
    }
}
