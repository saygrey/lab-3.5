package com.saygrey;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {
    //записывает список слов в файл
    public static void writeListStrToFile(File outFile, List<String> outList) {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(outFile));
            for (String x : outList) {
                writer.write(x + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}