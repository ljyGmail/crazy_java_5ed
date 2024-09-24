package com.pingpong.ch05_oop_1.sec07_polymorphism;

class A_BaseClass {
    public int book = 6;

    public void base() {
        System.out.println("父类的普通方法");
    }

    public void test() {
        System.out.println("父类的被覆盖的方法");
    }
}

public class A_SubClass extends A_BaseClass {
    // 重新定义一个book实例变量隐藏父类的book实例变量
    public String book = "轻量级Java EE企业使用实战";

    public void test() {
        System.out.println("子类的覆盖父类的方法");
    }

    public void sub() {
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
        // 下面编译时类型和运行时类型完全一样，因此不存在多态
        A_BaseClass bc = new A_BaseClass();
        // 输出6
        System.out.println(bc.book);
        // 下面两次调用将执行BaseCass的方法
        bc.base();
        bc.test();
        // 下面编译时类型和运行时类型完全一样，因此不存在多态
        A_SubClass sc = new A_SubClass();
        // 输出"轻量级Java EE企业应用实战"
        System.out.println(sc.book);
        // 下面调用将执行从父类继承得到的base方法
        sc.base();
        // 下面调用将执行当前类的test()方法
        sc.test();
        // 下面编译时类型和运行时类型不一样，多态发生
        A_BaseClass polymorphicBc = new A_SubClass();
        // 输出6 -- 表明访问的是父类对象的实例变量
        System.out.println(polymorphicBc.book);
        // 下面调用将执行当前类的test()方法
        polymorphicBc.base();
        // 下面调用将执行从父类继承得到的test()方法
        polymorphicBc.test();
        // 因为polymorphicBc的编译时类型时BaseClass
        // BaseClass类没有提供sub()方法，所以下面代码编译时会出现错误
        // polymorphicBc.sub();

        // 编译器推断出v1是SubClass类型
        var v1 = new A_SubClass();
        System.out.println(v1.getClass().getName());
        // 由于polymorphicBc的编译类型是BaseClass
        // 因此编译器推断出v2是BaseClass类型
        var v2 = polymorphicBc;
        // 由于BaseClass类没有提供sub方法，所以下面代码编译时会出现错误
        // v2.sub();
    }
}
