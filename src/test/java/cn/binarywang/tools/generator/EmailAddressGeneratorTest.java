package cn.binarywang.tools.generator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class EmailAddressGeneratorTest {

    @Test
    public void testGenerate() {
        String generatedEmail = EmailAddressGenerator.generate();
        System.err.println(generatedEmail);
        assertNotNull(generatedEmail);
    }

}
