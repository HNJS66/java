package com.experiment08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOTest {

    public static void main(String[] args) {
        String fileName = "C:/example/from.txt";
        System.out.println("----- 创建文件 ------");
        createFile(fileName);
        System.out.println("-----  将字符串写入文件 -------");
        // \r\n在txt文本中换行
        String str =
                "白日依山尽\r\n" +
                        "黄河入海流\r\n" +
                        "欲穷千里目\r\n" +
                        "更上一层楼\r\n";
        writeToFile(fileName, str);
        writeToFile2(fileName, str);
        System.out.println("--------- 基于基本IO流实现文件的复制 ----------");
        String sourceFile = "C:/example/from.txt";
        String targetFile = "C:/example/to.txt";
        copyByIO(sourceFile, targetFile);
        System.out.println("--------- 基于NIO实现文件的复制 ----------");
        String sourceFileNIO = "C:/example/from.txt";
        String targetFileNIO = "C:/example/nio/to.txt";
        copyByNIO(sourceFileNIO, targetFileNIO);
        System.out.println("---------- 遍历指定目录文件 -------------");
        String dir = "C:/example";
        walkDirectories(dir);
        System.out.println("---------- 删除指定文件 -------------");
        String fileToDelete = "C:/example/from.txt";
        deleteFile(fileToDelete);
    }

    // 创建文件
    private static void createFile(String fileName) {
        Path path = Paths.get(fileName);
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path.getParent());
                Files.createFile(path);
                System.out.println("文件创建成功。");
            } catch (IOException e) {
                System.out.println("创建文件时出错: " + e.getMessage());
            }
        } else {
            System.out.println("文件已存在，忽略操作。");
        }
    }

    // 使用FileOutputStream将内容写入文件
    private static void writeToFile(String fileName, String content) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("使用FileOutputStream将内容写入文件。");
        } catch (IOException e) {
            System.out.println("写入文件时出错: " + e.getMessage());
        }
    }

    // 使用Files类将内容写入文件
    private static void writeToFile2(String fileName, String content) {
        Path path = Paths.get(fileName);
        try {
            Files.write(path, content.getBytes());
            System.out.println("使用Files类将内容写入文件。");
        } catch (IOException e) {
            System.out.println("写入文件时出错: " + e.getMessage());
        }
    }

    // 使用基本IO复制文件
    private static void copyByIO(String sourceFile, String targetFile) {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(targetFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytesRead = 0;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytesRead += bytesRead;
            }
            System.out.println("使用基本IO复制文件。总共读取字节数: " + totalBytesRead);
        } catch (IOException e) {
            System.out.println("复制文件时出错: " + e.getMessage());
        }
    }

    // 使用NIO复制文件
    // 使用NIO复制文件
    private static void copyByNIO(String sourceFile, String targetFile) {
        Path sourcePath = Paths.get(sourceFile);
        Path targetPath = Paths.get(targetFile);

        // 确保目标文件所在的目录存在
        Path parentDir = targetPath.getParent();
        if (parentDir != null && !Files.exists(parentDir)) {
            try {
                Files.createDirectories(parentDir);
            } catch (IOException e) {
                System.out.println("创建目标文件所在目录时出错: " + e.getMessage());
                return;
            }
        }

        try {
            Files.copy(sourcePath, targetPath);
            System.out.println("使用NIO复制文件。");
        } catch (IOException e) {
            System.out.println("复制文件时出错: " + e.getMessage());
        }
    }

    // 遍历目录
    private static void walkDirectories(String dir) {
        try {
            Files.walk(Paths.get(dir))
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("遍历目录时出错: " + e.getMessage());
        }
    }

    // 删除文件
    private static void deleteFile(String fileName) {
        Path path = Paths.get(fileName);
        try {
            Files.deleteIfExists(path);
            System.out.println("文件删除成功。");
        } catch (IOException e) {
            System.out.println("删除文件时出错: " + e.getMessage());
        }
    }
}