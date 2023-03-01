package com.herbalife.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NIOPackage {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("./testFile.txt"));
        System.out.println(lines);
    }
}
