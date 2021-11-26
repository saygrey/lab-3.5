package com.saygrey;

import java.io.File;


public class Main {
    static File inFile = new File("C:\\Users\\Dima\\Desktop\\test\\testIn.txt");
    static File outFile = new File("C:\\Users\\Dima\\Desktop\\test\\testout.txt");

    public static void main(String[] args) {
        StringWorks works = new StringWorks(Reader.getStringsFromFile(inFile));
        Writer.writeListStrToFile(outFile, works.getWordsForPattern("\\d{3}"));
    }
}