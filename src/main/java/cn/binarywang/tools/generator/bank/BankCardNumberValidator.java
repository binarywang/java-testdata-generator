package cn.binarywang.tools.generator.bank;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import cn.binarywang.tools.generator.util.LuhnUtils;

/**
 * <pre>
 * 银行卡号校验类
 * Created by Binary Wang on 2018/3/22.
 * </pre>
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
public class BankCardNumberValidator {

    /**
     * 校验银行卡号是否合法
     *
     * @param cardNo 银行卡号
     * @return 是否合法
     */
    public static boolean validate(String cardNo) {
        if (StringUtils.isEmpty(cardNo)) {
            return false;
        }

        if (!NumberUtils.isDigits(cardNo)) {
            return false;
        }

        if (cardNo.length() > 19 || cardNo.length() < 16) {
            return false;
        }

        int luhnSum = LuhnUtils.getLuhnSum(cardNo.substring(0, cardNo.length() - 1).trim().toCharArray());
        char checkCode = (luhnSum % 10 == 0) ? '0' : (char) ((10 - luhnSum % 10) + '0');
        return cardNo.substring(cardNo.length() - 1).charAt(0) == checkCode;
    }


}
