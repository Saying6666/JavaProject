package com.example;

public class Main {
   /**
    * 认识string的3大类
    * String
    * StringBuffer
    * StringBuilder
    * 
    * 
    * 
    * 
    * @param args
    */

   public static void main(String[] args) {

      String str = "Hello";
      StringBuffer stringBuffer = new StringBuffer("Hello");
      StringBuilder stringBuilder = new StringBuilder("Hello");

      /**
       * String类
       * 
       * 不可变字符序列
       * 线程安全
       * 性能较低
       * 
       * 一个String对象一旦被创建，其内部的字符序列就永远不能被改变 22。任何看似修改
       * String对象的操作，例如字符串拼接（concatenation），实际上都会创建一个全新的String对象，而原始对象保持不变 25。
       */

      String s = "Hello";
      s = s + " World"; // 这里的"+"操作创建了一个新的String对象"Hello World"
      // 然后让引用s指向这个新对象。原始的"Hello"对象仍然存在于内存中，
      // 如果没有其他引用指向它，它将被垃圾回收器回收

      /*
       * 不变性的性能陷阱
       * 这种不变性设计带来了线程安全、可缓存等优点，但也隐藏着一个巨大的性能陷阱，尤其是在循环中进行字符串拼接时。考虑以下代码：
       */
      String[] words = { "a", "b", "c", "d", "e" };
      String result = "";
      for (String word : words) {
         result = result + word; // 性能极差！

         /*
          * 
          * 这段代码看起来很无害，但其时间复杂度是O(n^2)。为什么？因为在每次循环中，  
          * result +
          * word都会创建一个新的String对象，其长度比前一个更长。为了创建新对象，JVM需要分配新内存，并把旧result和新word的内容都复制过去。
          * 随着result越来越长，这个复制操作的成本也越来越高，导致整体性能急剧下降
          */
      }

      /**
       * StringBuffer类
       * 
       * 可变字符序列
       * 线程安全
       * 性能较低
       * 
       * StringBuffer是一个可变的字符序列，允许在不创建新对象的情况下修改内容。它是线程安全的，适用于多线程环境，但由于其同步机制，性能较低。
       */

      String[] wordss = { "a", "b", "c", "d", "e" };
      StringBuilder sb = new StringBuilder();
      for (String word : wordss) {
         sb.append(word); // 高效的追加操作
      }
      String results = sb.toString(); // 最后转换回String对象

      /**
       * StringBuilder类
       * 
       * 可变字符序列
       * 非线程安全
       * 性能较高
       * 
       * StringBuilder与StringBuffer类似，但不提供同步机制，因此在单线程环境中性能更高。它是处理大量字符串操作的首选。
       */

      String[] wordsss = { "a", "b", "c", "d", "e" };
      StringBuilder sbb = new StringBuilder();
      for (String word : wordsss) {
         sbb.append(word); // 高效的追加操作
      }
      String resultsss = sbb.toString(); // 最后转换回String对象

   }

}