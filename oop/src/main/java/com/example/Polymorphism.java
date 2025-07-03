package com.example;

import com.example.Inheritance.Vehicle;

public class Polymorphism {

    public static void main(String[] args) {

        Vehicle myVehicle1 = new Car(); // 父类引用指向子类对象
        Vehicle myVehicle2 = new Bicycle(); // 父类引用指向另一个子类对象

        myVehicle1.start(); // 运行时，JVM知道myVehicle1实际是Car，调用Car的start() -> 输出 "汽车引擎启动了。"
        myVehicle2.start(); // 运行时，JVM知道myVehicle2实际是Bicycle，调用Bicycle的start() -> 输出 "开始踩动脚踏板。"

    }

    public static class Car extends Vehicle {
        @Override // 明确表示这是在重写父类方法
        public void start() {
            System.out.println("汽车引擎启动了。");
        }

        public void honk() {
            System.out.println("嘀嘀！汽车鸣笛。");
        }
    }

    public static class Bicycle extends Vehicle {
        @Override
        public void start() {
            System.out.println("开始踩动脚踏板。");
        }
    }
}
