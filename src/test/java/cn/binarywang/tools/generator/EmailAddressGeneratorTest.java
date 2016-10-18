package cn.binarywang.tools.generator;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

public class EmailAddressGeneratorTest {

    @Test
    public void testGenerate() {
        String generatedEmail = EmailAddressGenerator.getInstance().generate();
        System.err.println(generatedEmail);
        assertNotNull(generatedEmail);
    }

}
