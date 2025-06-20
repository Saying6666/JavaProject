package main.java.com.variable;

public class Variable {
    //学习变量
    public static void main(String[] args) {
        /**
         * 变量是内存中用于存储数据的命名空间。
         * 在Java中，变量可以存储不同类型的数据，如整数、浮点数、字符和字符串等。
         * 变量是可以修改的，这意味着你可以在程序运行时改变它们的值。
         * 
         * 
         * 
         * 
         */
        // 定义变量
        int age = 25; // 整数类型变量
        double height = 1.75; // 浮点数类型变量
        String name = "Alice"; // 字符串类型变量

        // 输出变量的值
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");


        // 修改变量的值
        age = 30;
        height = 1.80;
        name = "Bob";

        // 输出修改后的变量值
        System.out.println("Updated Name: " + name);
        System.out.println("Updated Age: " + age);
        System.out.println("Updated Height: " + height + " meters");
        // 使用变量进行计算
        int yearsToRetirement = 65 - age; // 计算到退休的年
        System.out.println("Years to retirement: " + yearsToRetirement);
        // 使用变量进行字符串拼接
        String greeting = "Hello, my name is " + name + " and I am " + age + " years old.";
        System.out.println(greeting);

        char initial = 'A'; // 字符类型变量
        System.out.println(initial+1); // 输出字符变量
        // 注意：字符类型变量可以进行算术运算，'A'的ASCII
        // 值是65，所以'A' + 1的结果是66，对应的字符是'B'。
    }
}
