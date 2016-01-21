package cn.binarywang.tools;

import java.util.Date;
import java.util.Random;

public class RandomUtils {
    private static Random random = null;

    public static Random getRandomInstance() {
        if (random == null) {
            random = new Random(new Date().getTime());
        }

        return random;
    }
}
