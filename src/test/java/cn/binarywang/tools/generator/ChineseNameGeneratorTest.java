package cn.binarywang.tools.generator;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

public class ChineseNameGeneratorTest {

    @Test
    public void testGenerate() {
        String generatedName = ChineseNameGenerator.getInstance().generate();
        assertNotNull(generatedName);
        System.err.println(generatedName);
    }

    @Test
    public void testGenerateOdd() {
        String generatedName = ChineseNameGenerator.getInstance().generateOdd();
        assertNotNull(generatedName);
        System.err.println(generatedName);
    }

}
