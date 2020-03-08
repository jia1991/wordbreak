package com.hkj.priv;

public class Execute1 {
    public static void main(String[] args)   {
        if (args.length == 0) {
            System.out.println("there are no sentences to break;");
            return;
        }
        Sentence.wordBreak(args[0]);
    }
}
