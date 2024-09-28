package com.pingpong.ch05_oop_1.sec08_inheritance_and_composition;

class A_Base {
    public A_Base() {
        test();
    }

    // 1号test()方法
    public void test() {
        System.out.println("将被子类重写的方法");
    }
}

public class A_Sub extends A_Base {
    private String name;

    // 2号test()方法
    public void test() {
        System.out.println("子类重写父类的方法，" + "其name字符串长度: " + name.length());
    }

    public static void main(String[] args) {
        // 下面代码会引发空指针异常
        var s = new A_Sub();
    }
}
