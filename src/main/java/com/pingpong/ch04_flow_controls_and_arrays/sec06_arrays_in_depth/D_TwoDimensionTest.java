package com.pingpong.ch04_flow_controls_and_arrays.sec06_arrays_in_depth;

import java.util.Arrays;

public class D_TwoDimensionTest {
    public static void main(String[] args) {
        // 定义一个二维数组
        int[][] a;
        // 把a当成一维数组进行初始化，初始化a是一个长度为4的数组
        // a数组的数组元素又是引用类型
        a = new int[4][];
        // 把a当成一维数组，遍历a数组的每个数组元素
        for (int i = 0, len = a.length; i < len; i++) {
            System.out.println(a[i]);
        }
        // 初始化a数组的第一个元素
        a[0] = new int[2];
        // 访问a数组的第一个元素所指数组的第二个元素
        a[0][1] = 6;
        // a数组的第一个元素是一个一维数组，遍历这个一维数组
        for (int i = 0, len = a[0].length; i < len; i++) {
            System.out.println(a[0][i]);
        }

        // 同时初始化二维数组的两个维数
        int[][] b = new int[3][4];
        System.out.println(Arrays.toString(b));

        // 使用静态初始化语法来初始化一个二维数组
        String[][] str1 = new String[][] { new String[3], new String[] { "hello" } };
        System.out.println(Arrays.toString(str1));

        String[][] str2 = { new String[3], new String[] { "hello" } };
        System.out.println(Arrays.toString(str2));
    }
}
