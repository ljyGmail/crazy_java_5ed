package com.pingpong.ch04_flow_controls_and_arrays.sec05_arrays;

public class B_ForEachTest {
    public static void main(String[] args) {
        String[] books = { "轻量级Java EE企业应用实战",
                "疯狂Java讲义",
                "疯狂Android讲义" };

        // 使用foreach循环来遍历数组元素
        // 其中book将会自动迭代每个数组元素
        for (String book : books) {
            System.out.println(book);
        }
    }
}
