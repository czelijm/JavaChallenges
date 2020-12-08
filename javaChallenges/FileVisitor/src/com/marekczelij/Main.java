package com.marekczelij;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    String startDir = "resources";
	    String result="resultFile.txt";
	    Futil.processDir(startDir,result);
    }
}
