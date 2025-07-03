package main.java.com.example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Stream {
    /*
     * Java I/O提供了两种主要的流类型：
     * 字节流 (Byte
     * Streams)：以字节（8位）为单位处理数据。它们的基类是InputStream和OutputStream。字节流适用于处理任何类型的二进制数据，如图片
     * 、音频文件等。
     * 字符流 (Character
     * Streams)：以字符（16位Unicode）为单位处理数据。它们的基类是Reader和Writer。字符流在内部处理了字节到字符的转换，
     * 因此更适合处理文本数据，能正确处理各种字符编码 51。
     */

    // InputStream 和 OutputStream的使用方法
    public void streamExample() {
        try (InputStream inputStream = new FileInputStream("input.txt");
                OutputStream outputStream = new FileOutputStream("output.txt")) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // InputBufferedStream 和 OutputBufferedStream的使用方法
    public void bufferedStreamExample() {
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream("input.txt"));
                OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("output.txt"))) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 现代I/O操作：try-with-resources
    public static class ModernFileReader {
        public void readFile(String filePath) {
            // 使用 try-with-resources 语句
            try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("读取文件时出错: " + e.getMessage());
            }
        }
    }
}
