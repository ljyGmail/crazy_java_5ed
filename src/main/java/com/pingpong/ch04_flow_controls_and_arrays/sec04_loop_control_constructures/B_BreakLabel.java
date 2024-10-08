package com.pingpong.ch04_flow_controls_and_arrays.sec04_loop_control_constructures;

public class B_BreakLabel {
    public static void main(String[] args) {
        // 外层循环，outer作为标识符
        outer: for (var i = 0; i < 5; i++) {
            // 内层循环
            for (var j = 0; j < 3; j++) {
                System.out.println("i的值为: " + i + " j的值为: " + j);
                if (j == 1) {
                    // 跳出outer标签所标识的循环
                    break outer;
                }
            }
        }
    }
}
