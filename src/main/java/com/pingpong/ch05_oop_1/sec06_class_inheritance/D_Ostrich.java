package com.pingpong.ch05_oop_1.sec06_class_inheritance;

public class D_Ostrich extends C_Bird {
    // 重写Bird类的fly()方法
    @Override
    public void fly() {
        System.out.println("我只能在地上奔跑...");
    }

    public void callOverridedMethod() {
        // 在子类方法中通过super显式调用父类被覆盖的实例方法
        super.fly();
    }

    public static void main(String[] args) {
        // 创建Ostrich对象
        var os = new D_Ostrich();
        // 执行Ostrich对象的fly()方法，将输出"我只能在地上奔跑..."
        os.fly();
    }
}
