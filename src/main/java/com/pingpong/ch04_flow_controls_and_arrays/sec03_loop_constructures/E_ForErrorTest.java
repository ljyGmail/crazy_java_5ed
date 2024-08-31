package com.pingpong.ch04_flow_controls_and_arrays.sec03_loop_constructures;

public class E_ForErrorTest {
    public static void main(String[] args) {
        // 循环的初始化条件、循环条件、循环迭代语句都在下面一行
        for (var count = 0; count < 10; count++) {
            System.out.println(count);
            // 再次修改了循环变量
            // count *= 0.1; // 导致无限循环
        }
        System.out.println("循环结束!");
    }
}
