package com.saygrey;

import java.io.File;


public class Main {
    static File inFile = new File("C:\\Users\\Dima\\Desktop\\test\\testIn.bat");

    public static void main(String[] args) {
        StringWorks works = new StringWorks(Reader.getStringsFromFile(inFile));
        System.out.println(works.getMaxNum());
    }
}