package com.example;

public class Inheritance {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.setModel("Tesla Model 3");
        myCar.start(); // 调用从Vehicle继承的方法，输出 "交通工具启动了。"
        myCar.honk(); // 调用Car自己的方法，输出 "嘀嘀！汽车鸣笛。"

    }

    public static class Vehicle {
        private String model;

        public void start() {
            System.out.println("交通工具启动了。");
        }

        public void stop() {
            System.out.println("交通工具停止了。");
        }

        // model的getter和setter
        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }

    public static class Car extends Vehicle {
        // Car类自动拥有了Vehicle类的model属性以及start()和stop()方法

        // Car类还可以有自己独有的方法
        public void honk() {
            System.out.println("嘀嘀！汽车鸣笛。");
        }
    }

}
