package com.example;

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public class Car {
        private int speed; // 速度属性被私有化，外部无法直接访问

        // 公共的getter方法，用于读取速度
        public int getSpeed() {
            return this.speed;
        }

        // 公共的setter方法，用于设置速度
        public void setSpeed(int newSpeed) {
            if (newSpeed >= 0 && newSpeed <= 200) { // 在setter中可以加入验证逻辑
                this.speed = newSpeed;
            } else {
                System.out.println("无效的速度值！");
            }
        }
    }

}