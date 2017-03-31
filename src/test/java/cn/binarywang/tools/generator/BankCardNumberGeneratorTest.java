package cn.binarywang.tools.generator;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class BankCardNumberGeneratorTest {
    @Test
    public void testGenerateByPrefix() throws Exception {
        String bankCardNo = BankCardNumberGenerator.generateByPrefix(436742);
        System.err.println(bankCardNo);
        assertNotNull(bankCardNo);
    }

    @Test
    public void testGenerate() {
        String bankCardNo = BankCardNumberGenerator.getInstance().generate();
        System.err.println(bankCardNo);
        assertNotNull(bankCardNo);
    }

}
