package com.pingpong.ch05_oop_1.sec02_method_details;

public class C_Varargs {

    // 定义了参数个数可变的方法
    public static void test(int a, String... books) {
        // books被当成数组处理
        for (var tmp : books) {
            System.out.println(tmp);
        }
        // 输出整数变量a的值
        System.out.println(a);
    }

    public static void main(String[] args) {
        // 调用test方法
        test(5, "Java", "Python", "Javascript");
    }
}
