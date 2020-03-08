package com.hkj.priv;

import java.util.Arrays;
import java.util.List;

public class Dictionary {

    private static Dictionary dict = new Dictionary();
    private Dictionary(){};

    public static Dictionary  getDict() {
        return dict;
    }

    public static void updateDict (List newDict) {
        dict.dictionary = newDict;
    }

    public static void addDict (List newDict) {
        dict.dictionary.addAll(newDict);
    }

    private List<String> dictionary = Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man go");

    public String dictionaryWord(String word) {
        if (dictionary.contains(word)) {
            return word;
        } else {
            for (String w: dictionary) {
                String noSpaceWord = w.replace(" ", "");
                if (noSpaceWord.equals(word)) {
                    return w;
                }
            }
        }
        return null;
    }
}
