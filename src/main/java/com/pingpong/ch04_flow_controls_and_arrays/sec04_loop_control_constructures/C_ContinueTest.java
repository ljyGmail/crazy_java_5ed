package com.pingpong.ch04_flow_controls_and_arrays.sec04_loop_control_constructures;

public class C_ContinueTest {
    public static void main(String[] args) {
        // 一个简单的for循环
        for (var i = 0; i < 3; i++) {
            System.out.println("i的值是" + i);
            if (i == 1) {
                // 循环本次循环的剩下语句
                continue;
            }
            System.out.println("continue后的输出语句");
        }
    }
}
