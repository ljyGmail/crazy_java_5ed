package com.pingpong.ch06_oop_2.sec03_class_members;

class B_Singleton {
    // 使用一个类变量来缓存曾经曾经的实例
    private static B_Singleton instance;

    // 对构造器使用private修饰，隐藏该构造器
    private B_Singleton() {
    }

    // 提供一个静态方法，用于返回Singleton实例
    // 该方法可以加入自定义控制，保证只产生一个Singleton对象
    public static B_Singleton getInstance() {
        // 如果instance为null，则表明还不曾曾经Singleton对象
        // 如果instance不为null，则表明已经创建了SIngleton对象
        // 将不会重新创建新的实例
        if (instance == null) {
            // 创建一个Singleton对象，并将其缓存起来
            instance = new B_Singleton();
        }
        return instance;
    }
}

public class B_SingletonTest {
    public static void main(String[] args) {
        // 创建Singleton对象不能通过构造器
        // 只能通过getInstance方法来得到实例
        B_Singleton s1 = B_Singleton.getInstance();
        B_Singleton s2 = B_Singleton.getInstance();
        System.out.println(s1 == s2); // 将输出true
    }
}
