package com.saygrey;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Reader {
    //читает список слов из файла
    public static List<String> getStringsFromFile(File inFile) {
        List<String> strings = new ArrayList<>();
        try {
            strings = Files.lines(Paths.get(inFile.getPath())).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }
}