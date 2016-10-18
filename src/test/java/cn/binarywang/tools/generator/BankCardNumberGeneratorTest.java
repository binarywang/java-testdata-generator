package cn.binarywang.tools.generator;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

public class BankCardNumberGeneratorTest {

    @Test
    public void testGenerate() {
        String bankCardNo = BankCardNumberGenerator.getInstance().generate();
        System.err.println(bankCardNo);
        assertNotNull(bankCardNo);
    }

}
