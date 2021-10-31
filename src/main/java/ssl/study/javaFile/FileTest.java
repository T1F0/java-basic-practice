package com.supconit.study.javaFile;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("'/java/system'");
        File file1 = new File("/java/system");
        System.out.println(file.getName());
        System.out.println(file1.getName());
    }
}
