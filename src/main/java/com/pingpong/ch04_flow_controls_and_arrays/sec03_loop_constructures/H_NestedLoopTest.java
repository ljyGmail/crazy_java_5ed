package com.pingpong.ch04_flow_controls_and_arrays.sec03_loop_constructures;

public class H_NestedLoopTest {
    public static void main(String[] args) {
        // 外层循环
        for (var i = 0; i < 5; i++) {
            // 内层循环
            for (var j = 0; j < 3; j++) {
                System.out.println("i的值为: " + i + " j的值为: " + j);
            }
        }
    }
}
