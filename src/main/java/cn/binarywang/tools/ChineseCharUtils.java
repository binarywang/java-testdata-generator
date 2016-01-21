package cn.binarywang.tools;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public class ChineseCharUtils {

    private static final Random RANDOM_INSTANCE = RandomUtils
        .getRandomInstance();

    public static String genOneChineseChars() {
        String str = null;
        int highPos = (176 + Math.abs(RANDOM_INSTANCE.nextInt(39)));
        int lowPos = 161 + Math.abs(RANDOM_INSTANCE.nextInt(93));
        byte[] b = new byte[] { (new Integer(highPos)).byteValue(),
            (new Integer(lowPos)).byteValue() };

        try {
            str = new String(b, "GB2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return str;
    }

    public static String genFixedLengthChineseChars(int length) {
        String str = "";
        for (int i = length; i > 0; i--) {
            str = str + genOneChineseChars();
        }

        return str;
    }

    public static String genRandomLengthChineseChars(int start, int end) {
        String str = "";
        int length = RANDOM_INSTANCE.nextInt(end + 1);
        if (length < start) {
            str = genRandomLengthChineseChars(start, end);
        } else {
            for (int i = 0; i < length; i++) {
                str = str + genOneChineseChars();
            }
        }
        return str;
    }

    public static void main(String args[]) {
        System.out.println(genOneChineseChars());
        System.out.println(genFixedLengthChineseChars(20));
        System.out.println(genRandomLengthChineseChars(2, 3));
    }
}
