package com.saygrey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//класс строковых операций
public class StringWorks {
    List<String> notFormattedStringList;

    public StringWorks(List<String> inStringList) {
        notFormattedStringList = inStringList;
    }

    //отдает лист с искомыми словами
    public List<String> getResultList() {
        return getListWWordsWLastCharEquNextWordFirstChar(
                getWordsListFromString(
                        stringListToString(notFormattedStringList)
                ));
    }

    //преобразует список строк в единую строку
    private String stringListToString(List<String> inStringList) {
        String out = "";
        for (String x : inStringList) {
            out += x;
        }
        return out;
    }

    //разбивает строку на слова
    private List<String> getWordsListFromString(String inStr) {
        return Arrays.asList(inStr.split("( )+"));
    }

    //ищет в списке слов искомые
    private List<String> getListWWordsWLastCharEquNextWordFirstChar(List<String> wordsList) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i < wordsList.size() - 1; i++) {
            if (wordsList.get(i).toCharArray()[wordsList.get(i).toCharArray().length - 1] == wordsList.get(i + 1).toCharArray()[0]) {
                results.add(wordsList.get(i));
            }
        }
        return results;
    }
}