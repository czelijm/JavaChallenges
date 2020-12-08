package com.marekczelij;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor {
    FileVisitor<Path> visitor;

    public FileProcessor(FileVisitor<Path> visitor) {
        this.visitor = visitor;
    }

    public void process(String starDir) throws IOException {
        Path startingDir = Paths.get(starDir);
        Files.walkFileTree(startingDir, visitor);
        return;
    }


}
