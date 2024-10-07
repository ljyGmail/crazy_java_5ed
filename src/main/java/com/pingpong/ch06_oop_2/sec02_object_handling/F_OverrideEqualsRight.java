package com.pingpong.ch06_oop_2.sec02_object_handling;

class F_Person {
    private String name;
    private String idStr;

    public F_Person() {
    }

    public F_Person(String name, String idStr) {
        this.name = name;
        this.idStr = idStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    // 重写equals()方法，提供自定义的相等标准
    public boolean equals(Object obj) {
        // 如果两个对象为同一个对象
        if (this == obj) {
            return true;
        }
        // 只有当obj是Person对象
        if (obj != null && obj.getClass() == F_Person.class) {
            var personObj = (F_Person) obj;
            // 并且当前对象的idStr与obj对象的idStr相等时才可判断两个对象相等
            if (this.getIdStr().equals(personObj.getIdStr())) {
                return true;
            }
        }
        return false;
    }
}

public class F_OverrideEqualsRight {
    public static void main(String[] args) {
        var p1 = new F_Person("孙悟空", "12343433433");
        var p2 = new F_Person("孙行者", "12343433433");
        var p3 = new F_Person("孙悟饭", "99933433");
        // p1和p2的idStr相等，所以输出true
        System.out.println("p1和p2是否相等? " + p1.equals(p2));
        // p2和p3的idStr不相等，所以输出false
        System.out.println("p2和p3是否相等? " + p2.equals(p3));
    }
}
