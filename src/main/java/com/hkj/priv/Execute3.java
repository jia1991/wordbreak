package com.hkj.priv;

import java.util.Arrays;
import java.util.List;

public class Execute3 {
    public static void main(String[] args)   {
        if (args.length < 2) {
            System.out.println("Lack of required input parameters");
            return;
        }
        String dictStr = args[1];
        String[] dictArr = dictStr.split(",");
        List newDict = Arrays.asList(dictArr);
        Dictionary.addDict(newDict);
        Sentence.wordBreak(args[0]);
    }
}
