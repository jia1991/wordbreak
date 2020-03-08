package com.hkj.priv;

import java.util.Arrays;
import java.util.List;

public class Sentence {

    public static void wordBreak(String str) {
        wordBreakUtil(str, str.length(), "");
    }

    public static void wordBreakUtil (String str, int n, String result) {
        Dictionary dict = Dictionary.getDict();
        int startIndex = 0;
        boolean goon = true;
        while (goon) {
            for (int i=startIndex+1; i<=n; i++) {
                String prifix = str.substring(startIndex, i);
                String dictWord = dict.dictionaryWord(prifix);
                if (dictWord != null) {
                    String pri = "";
                    if (startIndex != 0) {
                        pri = str.substring(0, startIndex) + " ";
                    }
                    if(i == n) {
                        result += (pri + dictWord);
                        System.out.println(result);
                        return;
                    }
                    wordBreakUtil(str.substring(i, n), n-i, result + pri + dictWord + " ");
                    goon = false;
                } else if (i == n){
                    startIndex ++;

                    if (startIndex == n){
                        result += str;
                        System.out.println(result);
                        return;
                    }
                }
            }
        }
    }
}