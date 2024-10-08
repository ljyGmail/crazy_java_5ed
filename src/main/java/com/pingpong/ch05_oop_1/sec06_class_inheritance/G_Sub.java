package com.pingpong.ch05_oop_1.sec06_class_inheritance;

class G_Base {
    public double size;
    public String name;

    public G_Base(double size, String name) {
        this.size = size;
        this.name = name;
    }
}

public class G_Sub extends G_Base {
    public String color;

    public G_Sub(double size, String name, String color) {
        // 通过super调用来调用父类构造器的初始化过程
        super(size, name);
        this.color = color;
    }

    public static void main(String[] args) {
        var s = new G_Sub(5.6, "测试对象", "红色");
        // 输出Sub对象的三个实例变量
        System.out.println(s.size + "--" + s.name + "--" + s.color);
    }
}
