package cn.binarywang.tools.generator;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

public class ChineseAddressGeneratorTest {

    @Test
    public void testGenerate() {
        String generatedAddress = ChineseAddressGenerator.getInstance()
            .generate();
        System.err.println(generatedAddress);
        assertNotNull(generatedAddress);
    }

}
