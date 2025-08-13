package io.file;

import java.io.File;
import java.io.IOException;

public class OldFilePath {

    public static void main(String[] args) throws IOException {
        File file = new File("temp/..");
        System.out.println("path = " + file.getPath());

        // 절대 경로
        System.out.println("Absolute Path = " + file.getAbsolutePath());

        // 정규 경로
        System.out.println("Canonical Path = " + file.getCanonicalPath());

        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println((f.isFile() ? "F" : "D") + " | " + f.getName());
        }
    }
}
