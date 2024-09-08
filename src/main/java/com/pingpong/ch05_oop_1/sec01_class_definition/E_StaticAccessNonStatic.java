package com.pingpong.ch05_oop_1.sec01_class_definition;

public class E_StaticAccessNonStatic {
    public void info() {
        System.out.println("简单的info方法");
    }

    public static void main(String[] args) {
        // 因为main()方法是静态方法
        // 调用main()方法的是该类本身，而不是该类的实例
        // 因此省略的this无法指向有效的对象
        // info(); // 无法从静态上下文引用非静态方法info()
        new E_StaticAccessNonStatic().info();
    }
}
