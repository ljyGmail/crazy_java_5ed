package com.pingpong.ch05_oop_1.sec02_method_details;

public class D_Recursive {

    public static int fn(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            // 方法中调用它自身，就是方法递归
            return 2 * fn(n - 1) + fn(n - 2);
        }
    }

    public static int fn2(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            // 方法中调用它自身，就是方法递归
            return fn(n + 2) - 2 * fn(n + 1);
        }
    }

    public static void main(String[] args) {
        // 输出fn(10)的结果
        System.out.println(fn(10));
        System.out.println(fn2(10));
    }
}
