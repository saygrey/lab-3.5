package com.saygrey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//класс строковых операций
public class StringWorks {
    private List<String> notFormattedStringList;
    private String formattedString="";

    public StringWorks(List<String> inStringList) {
        notFormattedStringList = inStringList;
        stringListToFormattedString();
    }

    //отдает лист с искомыми словам

    //преобразует список строк в список слов
    private void stringListToFormattedString() {
        String tempStr = "";
        for (String x : notFormattedStringList) {
            tempStr += x;
        }
        for(String word:tempStr.split("( )+")){
            formattedString+=word+" ";
        }
    }

    //ищет в списке слов искомые
    public List<String> getWordsForPattern(String pattern) {

        List<String> results = new ArrayList<>();

        Pattern regexp = Pattern.compile(pattern);

        Matcher match = regexp.matcher(formattedString);
        while(match.find()) {
            results.add(match.group());
        }
        return results;
    }
}