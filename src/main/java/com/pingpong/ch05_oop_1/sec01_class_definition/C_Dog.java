package com.pingpong.ch05_oop_1.sec01_class_definition;

public class C_Dog {

    // 定义一个jump()方法
    public void jump() {
        System.out.println("正在执行jump方法");
    }

    // 定义一个run()方法，run()方法需要借助jump()方法
    public void run() {
        // First version
        // var d = new C_Dog();
        // d.jump();

        // Using this
        // this.jump();

        // Omit this
        jump();
        System.out.println("正在执行run方法");
    }
}
