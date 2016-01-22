package cn.binarywang.tools.generator;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

public class SomethingTest {

    @Test
    public void test() {
        List<String> aList = Lists.newArrayList(Lists.asList("MOTHER", "FATHER",
            new String[] { "SPOUSE", "OTHER" }));
        Collections.shuffle(aList);
        System.err.println(aList);
    }

}
