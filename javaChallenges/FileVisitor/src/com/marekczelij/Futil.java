package com.marekczelij;

import java.io.IOException;
import java.nio.file.Path;

public class Futil {

    public static void processDir(String dirName, String resultFileName) throws IOException {
//        FileProcessor processor = new FileProcessor(new FileWalker(resultFileName));
//        processor.process(dirName);
        new FileProcessor(new FileWalker(resultFileName)).process(dirName);
    }
}
