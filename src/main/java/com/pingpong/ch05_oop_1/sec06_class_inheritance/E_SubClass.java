package com.pingpong.ch05_oop_1.sec06_class_inheritance;

class E_BaseClass {
    public int a = 5;
}

public class E_SubClass extends E_BaseClass {
    public int a = 7;

    public void accessOwner() {
        System.out.println(a);
    }

    public void accessBase() {
        // 通过super来限定访问从父类继承得到的a实例变量
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        var sc = new E_SubClass();
        sc.accessOwner(); // 输出7
        sc.accessBase(); // 输出5
    }
}
