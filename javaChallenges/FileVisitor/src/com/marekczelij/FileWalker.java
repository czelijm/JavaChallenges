package com.marekczelij;

import com.sun.source.tree.ContinueTree;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FileWalker extends SimpleFileVisitor<Path> {

    private String fileResult = "example.txt";
    private StringBuffer fileAggregator = new StringBuffer();
    private String coding = "CP1250";
    private String startDirName;
    public BiFunction< FileInputStream,String,String> fileReaderFun = (fis,encoding)->{
        try( BufferedReader br =
                     new BufferedReader( new InputStreamReader(fis, encoding )))
        {
            StringBuilder sb = new StringBuilder();
            String line;
            while(( line = br.readLine()) != null ) {
                sb.append( line );
//                sb.append( '\n' );
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    };
    public BiFunction<FileOutputStream,String,Void> fileWriterFun = (f,s) ->{
        try (OutputStreamWriter osw =  new OutputStreamWriter(f,
                StandardCharsets.UTF_8)) {
            osw.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    };


    protected FileWalker() { super(); }

    protected FileWalker(String fileResult) {
        super();
        this.fileResult=fileResult;
    }

    protected FileWalker(String startDirName,String fileResult, BiFunction< FileInputStream,String,String> biFunRead, String coding,BiFunction<FileOutputStream,String,Void> biFunWrite) {
        super();
        this.startDirName=startDirName;
        this.fileReaderFun = biFunRead;
        this.fileWriterFun = biFunWrite;
        this.coding=coding;
        this.fileResult=fileResult;
    }



//    @Override
//    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
////        System.out.println(dir.toString());
//        fos = new FileOutputStream(fileResult,true);
//        return FileVisitResult.CONTINUE;
//    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//        System.out.println(fileReaderFun.apply(new FileInputStream(file.toString()),"CP1250") );
        //fileAggregator.append(fileReaderFun.apply(new FileInputStream(file.toString()),"CP1250")+"\n");
        FileOutputStream fos = new FileOutputStream(fileResult,true);
        fileWriterFun.apply(fos,fileReaderFun.apply(new FileInputStream(file.toString()),"CP1250")+"\n");
        return FileVisitResult.CONTINUE;
    }
//
//    @Override
//    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
//        return super.visitFileFailed(file, exc);
//    }
//
//    @Override
//    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
//        return super.postVisitDirectory(dir, exc);
//    }

    public String getFileResult() {
        return fileAggregator.toString();
    }

}
