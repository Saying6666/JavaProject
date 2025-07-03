package main.java.com.example;

public class try_catch_finally {

    /*
     * 
     * try 块：将可能引发异常的代码包裹在try块中。如果try块中的代码在执行期间发生异常，它会立即停止执行，并创建一个异常对象。
     * catch 块：紧跟在try块之后，用于捕获并处理特定类型的异常。一个try块可以跟多个catch块，以处理不同类型的异常。当异常发生时，
     * JVM会寻找能够处理该异常类型的catch块并执行其中的代码。
     * finally
     * 块：无论是否发生异常，finally块中的代码总会被执行。它通常用于执行“清理”工作，如关闭文件流、释放网络连接或数据库连接等，以确保关键资源得到释放
     * 49。
     * 
     */

    /*
     * 受查异常 (Checked
     * Exceptions)：这类异常继承自Exception类（但不是RuntimeException的子类）。编译器会强制开发者处理它们，要么使用try-
     * catch捕获，要么在方法签名上使用throws关键字声明抛出。它们通常代表程序外部的可预见的、可恢复的错误，如IOException（文件操作问题）、
     * SQLException（数据库问题）。这种设计哲学是，API的调用者必须意识到这些潜在问题并制定应对计划。
     * 非受查异常 (Unchecked
     * Exceptions)：这类异常继承自RuntimeException。编译器不强制开发者处理它们。它们通常代表编程错误或逻辑缺陷，
     * 如NullPointerException（对null引用调用方法）、ArrayIndexOutOfBoundsException（数组索引越界）、
     * IllegalArgumentException（非法参数）。最佳实践是修复导致这些异常的代码，而不是捕获它们。
     */
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // 可能会抛出异常
        } catch (ArithmeticException e) {
            System.out.println("捕获到算术异常：" + e.getMessage());
        } finally {
            System.out.println("无论是否发生异常，都会执行的代码块");
        }
    }
}
