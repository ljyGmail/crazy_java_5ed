package com.pingpong.ch06_oop_2.sec02_object_handling;

class A_Person {

    private String name;

    public A_Person(String name) {
        this.name = name;
    }
}

public class A_PrintObject {
    public static void main(String[] args) {
        // 创建一个Person对象，将之赋给p变量
        var p = new A_Person("孙悟空");
        // 打印p所引用的Person对象
        System.out.println(p);
        System.out.println(p.toString());
        System.out.println(p + "");
        System.out.println(p.toString() + "");
    }
}
