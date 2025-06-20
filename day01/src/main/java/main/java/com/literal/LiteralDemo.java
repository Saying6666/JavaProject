package main.java.com.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        printLiterals();
    }
    public static void  printLiterals() {
        // Integer literals整数字面量
        int decimal = 100; // 十进制
        System.out.println(decimal);

        //浮点数字面量
        float floatNumber = 10.5f; // 浮点数
        System.out.println(floatNumber);

        //布尔字面量

        boolean isTrue = true; // 布尔值
        System.out.println(isTrue);
        boolean isFalse = false;
        System.out.println(isFalse);

        // 字符字面量,用单引号括起来,里面只能有一个字符
        System.out.println('A'); // 字符

        System.out.println(' ');

       //特殊字符字面量
        char specialChar = '\n'; // 换行符
        System.out.println("Hello" + specialChar + "World");

        //字符串字面量,用双引号括起来,可以包含多个字符
        String str = "Hello, World!";
        System.out.println(str);

        //十六进制字面量
        int hexNumber = 0x1A; // 十六进制
        System.out.println(hexNumber);

        //八进制字面量
        int octalNumber = 012; // 八进制
        System.out.println(octalNumber);
        
        //二进制字面量
        int binaryNumber = 0b1010; // 二进制

    }
}
