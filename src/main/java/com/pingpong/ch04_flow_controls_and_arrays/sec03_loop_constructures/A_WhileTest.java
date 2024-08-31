package com.pingpong.ch04_flow_controls_and_arrays.sec03_loop_constructures;

public class A_WhileTest {
    public static void main(String[] args) {
        // 循环的初始化条件
        var count = 0;

        // 当count小于10时，执行循环体
        while (count < 10) {
            System.out.println(count);

            // 迭代语句
            count++;
        }
        System.out.println("循环结束!");
    }
}
