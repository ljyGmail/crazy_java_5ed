package com.pingpong.ch05_oop_1.sec04_information_hiding_and_encapsulation.liang;

import com.pingpong.ch05_oop_1.sec04_information_hiding_and_encapsulation.liang.sub.E_Apple;
import java.util.*;
import java.sql.*;

public class D_HelloTest {
    public static void main(String[] args) {
        // 直接访问相同包下的另一个类，无须使用包前缀
        var h = new C_Hello();

        // 调用构造器时需要在构造器前增加包前缀
        // 使用类全名的写法
        var a = new com.pingpong.ch05_oop_1.sec04_information_hiding_and_encapsulation.liang.sub.E_Apple();

        // 如果使用import语句来导入Apple类，就可以不再使用类全名了
        var aa = new E_Apple();

        // 为了让引用更加明确，即使使用了import语句，也还是需要使用类的全名
        // Date date = new Date();
        java.sql.Date d = new java.sql.Date(1000L);
    }
}
