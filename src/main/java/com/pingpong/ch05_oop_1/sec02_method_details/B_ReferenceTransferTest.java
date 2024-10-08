package com.pingpong.ch05_oop_1.sec02_method_details;

class DataWrap {
    int a;
    int b;
}

public class B_ReferenceTransferTest {

    public static void swap(DataWrap dw) {
        // 下面三行代码实现dw的a、b两个成员变量的值交换
        // 定义一个临时变量来保存dw对象的a成员变量的值
        var tmp = dw.a;
        // 把dw对象的b成员变量的值赋给a成员变量
        dw.a = dw.b;
        // 把临时变量tmp的值赋给dw对象的b成员变量
        dw.b = tmp;
        System.out.println("swap方法里，a成员变量的值是:" + dw.a + "; b的成员变量的值是" + dw.b);

        // 把dw直接赋值为null，让它不再指向任何有效地址
        dw = null;
    }

    public static void main(String[] args) {
        var dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("交换结束后，a成员变量的值是" + dw.a + "; b成员变量的值是" + dw.b);
    }
}
