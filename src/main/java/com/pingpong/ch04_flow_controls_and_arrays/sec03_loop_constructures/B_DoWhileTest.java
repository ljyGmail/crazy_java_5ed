package com.pingpong.ch04_flow_controls_and_arrays.sec03_loop_constructures;

public class B_DoWhileTest {
    public static void main(String[] args) {
        // 定义变量count
        var count = 1;

        // 执行do while循环
        do {
            System.out.println(count);

            // 循环迭代语句
            count++;
            // 循环条件紧跟while关键字
        } while (count < 10);
        System.out.println("循环结束!");
    }
}
