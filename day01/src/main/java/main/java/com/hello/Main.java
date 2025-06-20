// File: Main.java
package main.java.com.hello;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(sum(1,3));


    }
    //打印3行hello world
    public static void printHelloWorld() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello world!");
        }
    }

    //求两个整数的和
    public static int sum(int a, int b) {
        return a + b;
    }

}

