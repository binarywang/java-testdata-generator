package cn.binarywang.tools.generator.util;

import org.testng.annotations.Test;

import static cn.binarywang.tools.generator.util.ChineseCharUtils.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * 单元测试.
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 * @date 2020-10-03
 */
@Test
public class ChineseCharUtilsTest {
    public void testGenOneChineseChars() {
        final String result = genOneChineseChars();
        System.out.println(result);
        assertThat(result).hasSize(1);
    }

    public void testGenFixedLengthChineseChars() {
        final String result = genFixedLengthChineseChars(20);
        System.out.println(result);
        assertThat(result).hasSize(20);
    }

    public void testGenRandomLengthChineseChars() {
        final String result = genRandomLengthChineseChars(2, 10);
        System.out.println(result);
        assertThat(result).hasSizeBetween(2, 10);
    }

    public void testGetOneOddChar() {
        final char result = getOneOddChar();
        System.out.println(result);
        assertThat(result).isNotNull();
    }
}
