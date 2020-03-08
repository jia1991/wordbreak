package com.hkj.priv.test;

import com.hkj.priv.Dictionary;
import com.hkj.priv.Sentence;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SentenceTest {
    @Test
    public void wordbreak() {
        Sentence.wordBreak("ilikesamsungmobile");
        Sentence.wordBreak("ilikeicecreamandmango");
    }

    @Before
    public void BeforeBreak () {
        List newDict = Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "mango");
        Dictionary.updateDict(newDict);
    }
}
