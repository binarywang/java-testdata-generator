package cn.binarywang.tools.generator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ChineseMobileNumberGeneratorTest {

    @Test
    public void testGenerate() {
        String generatedMobileNum = ChineseMobileNumberGenerator.getInstance()
            .generate();
        System.err.println(generatedMobileNum);
        assertNotNull(generatedMobileNum);
    }

}
