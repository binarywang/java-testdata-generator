package cn.binarywang.tools.generator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ChineseNameGeneratorTest {

    @Test
    public void testGenerate() {
        String generatedName = ChineseNameGenerator.getInstance().generate();
        System.err.println(generatedName);
        assertNotNull(generatedName);
    }

}
