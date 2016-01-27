package cn.binarywang.tools.generator.base;

import java.util.Date;
import java.util.Random;

public abstract class GenericGenerator {
    public abstract String generate();

    private static Random random = null;

    protected Random getRandomInstance() {
        if (random == null) {
            random = new Random(new Date().getTime());
        }

        return random;
    }
}
