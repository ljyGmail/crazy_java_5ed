package com.pingpong.ch05_oop_1.sec03_member_and_local_variables;

import java.beans.PersistenceDelegate;

class A_Person {
    // 定义一个实例变量
    public String name;

    // 定义一个类变量
    public static int eyeNum;
}

public class A_PersonTest {
    public static void main(String[] args) {
        // 第一次主动使用Person类，该类自动初始化，则eyeNum变量开始起作用，输出0
        System.out.println("Person的eyeNum类变量值: " + A_Person.eyeNum);
        // 创建Person对象
        var p = new A_Person();
        // 通过Person对象的引用p来访问Person对象name实例变量
        // 并通过实例访问eyeNum类变量
        System.out.println("p变量的name变量值是: " + p.name + " p对象的eyeNum变量值是: " + p.eyeNum);
        // 直接为name实例变量赋值
        p.name = "孙悟空";
        // 通过p访问eyeNum类变量，依然是访问Person的eyeNum变量
        p.eyeNum = 2;
        // 再次通过Person对象来访问name实例变量和eyeNum类变量
        System.out.println("p变量的name实例变量是: " + p.name + " p对象的eyeNum变量值是: " + p.eyeNum);
        // 前面通过p修改了Person的eyeNum，此处的Person.eyeNum将输出2
        System.out.println("Person的eyeNum类变量值: " + A_Person.eyeNum);
        var p2 = new A_Person();
        // p2访问的eyeNum类变量依然引用Person类的，因此依然输出2
        System.out.println("p2对象的eyeNum类变量值: " + p2.eyeNum);
    }
}
