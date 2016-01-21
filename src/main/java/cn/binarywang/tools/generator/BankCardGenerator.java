package cn.binarywang.tools.generator;

import java.util.Random;

import org.apache.commons.lang3.StringUtils;

/**
 * 效验是否为银行卡，用于验证
 * 现行 16 位银联卡现行卡号开头 6 位是 622126～622925 之间的，7 到 15 位是银行自定义的，
 * 可能是发卡分行，发卡网点，发卡序号，第 16 位是校验码。
 * 16 位卡号校验位采用 Luhm 校验方法计算：
 * 1，将未带校验位的 15 位卡号从右依次编号 1 到 15，位于奇数位号上的数字乘以 2
 * 2，将奇位乘积的个十位全部相加，再加上所有偶数位上的数字
 * 3，将加法和加上校验位能被 10 整除。
 */
public class BankCardGenerator {
    public void generate() {
        Random random = new Random();
//        ContiguousSet<Integer> sets = ContiguousSet
//            .create(Range.closed(622126, 622925), DiscreteDomain.integers());
//        ImmutableList<Integer> list = sets.asList();

        Integer prev = 622126 + random.nextInt(925 + 1 - 126);
        String bardNo = prev
            + StringUtils.leftPad(random.nextInt(999999999) + "", 9, "0");

        char[] chs = bardNo.trim().toCharArray();
        int luhmSum = 0;
        for (int i = chs.length - 1, j = 0; i >= 0; i--, j++) {
            int k = chs[i] - '0';
            if (j % 2 == 0) {
                k *= 2;
                k = k / 10 + k % 10;
            }
            luhmSum += k;
        }

        char checkCode = luhmSum % 10 == 0 ? '0'
            : (char) (10 - luhmSum % 10 + '0');

        System.err.println(bardNo + checkCode);
    }
}
