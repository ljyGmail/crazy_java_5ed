package com.pingpong.ch05_oop_1.sec01_class_definition;

public class G_ReturnThis {
    public int age;

    public G_ReturnThis grow() {
        age++;
        // return this返回调用该方法的对象
        return this;
    }

    public static void main(String[] args) {
        var rt = new G_ReturnThis();

        // 可以连续调用同一个方法
        rt.grow().grow().grow();

        System.out.println("rt的age成员变量值是: " + rt.age);
    }
}
