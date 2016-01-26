package cn.binarywang.tools.generator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BankCardNumberGeneratorTest {

    @Test
    public void testGenerate() {
        String bankCardNo = BankCardNumberGenerator.getInstance().generate();
        System.err.println(bankCardNo);
        assertNotNull(bankCardNo);
    }

}
