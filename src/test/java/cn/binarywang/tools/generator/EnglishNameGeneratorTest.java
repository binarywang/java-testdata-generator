package cn.binarywang.tools.generator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class EnglishNameGeneratorTest {

    @Test
    public void testGenerate() {
        String generatedName = EnglishNameGenerator.getInstance().generate();
        assertNotNull(generatedName);
        System.err.println(generatedName);
    }

}
