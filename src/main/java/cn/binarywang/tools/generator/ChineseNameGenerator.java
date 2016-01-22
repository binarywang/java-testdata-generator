package cn.binarywang.tools.generator;

import cn.binarywang.tools.ChineseCharUtils;
import cn.binarywang.tools.RandomUtils;

public class ChineseNameGenerator {
    private static final String[] FIRST_NAMES = new String[] { "李", "王", "张",
        "刘", "陈", "杨", "黄", "赵",
        "周", "吴", "徐", "孙", "朱", "马", "胡", "郭", "林", "何", "高", "梁", "郑", "罗",
        "宋", "谢", "唐", "韩", "曹", "许", "邓", "萧", "冯", "曾", "程", "蔡", "彭", "潘",
        "袁", "於", "董", "余", "苏", "叶", "吕", "魏", "蒋", "田", "杜", "丁", "沈", "姜",
        "范", "江", "傅", "钟", "卢", "汪", "戴", "崔", "任", "陆", "廖", "姚", "方", "金",
        "邱", "夏", "谭", "韦", "贾", "邹", "石", "熊", "孟", "秦", "阎", "薛", "侯", "雷",
        "白", "龙", "段", "郝", "孔", "邵", "史", "毛", "常", "万", "顾", "赖", "武", "康",
        "贺", "严", "尹", "钱", "施", "牛", "洪", "龚" };

    public static String generate() {
        return genFirstName()
            + ChineseCharUtils.genRandomLengthChineseChars(1, 14);
    }

    private static String genFirstName() {
        return FIRST_NAMES[RandomUtils.getRandomInstance()
            .nextInt(FIRST_NAMES.length)];
    }

}
