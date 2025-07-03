package com.example;

public class Abstraction {

    // 抽象类

    public static abstract class Shape {
        private String color; // 共享的状态

        public Shape(String color) { // 构造方法，供子类调用
            this.color = color;
        }

        public abstract double getArea(); // 抽象方法，强制子类实现

        public abstract double getPerimeter(); // 抽象方法

        public String getColor() { // 具体方法，被所有子类共享
            return color;
        }
    }

    public class Circle extends Shape {
        private double radius;

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    // 接口
    public interface Flyable {
        void fly(); // 契约：任何实现Flyable的类都必须提供fly的实现
    }

    public static class Animal {
        public void eat() {
            System.out.println("动物在吃东西。");
        }
    }

    public static class Bird extends Animal implements Flyable {
        @Override
        public void fly() {
            System.out.println("鸟在扇动翅膀飞翔。");
        }
    }

    public static class Plane implements Flyable {
        @Override
        public void fly() {
            System.out.println("飞机依靠引擎和机翼飞行。");
        }
    }

}
