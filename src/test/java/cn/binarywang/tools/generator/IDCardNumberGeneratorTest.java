package cn.binarywang.tools.generator;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;

public class IDCardNumberGeneratorTest {

    @Test
    public void generateRandomDate() {
        Date randomDate = IDCardNumberGenerator.randomDate();
        System.err.println(randomDate);
        assertNotNull(randomDate);
    }

    @Test
    public void testGenerate() {
        String idCard = IDCardNumberGenerator.generate();
        System.err.println(idCard);
        assertNotNull(idCard);
    }
}
