package cn.binarywang.tools.generator;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

public class SomethingTest {

    @Test
    public void test() {
        //(0:未知;1:本人;2:单位;3:配偶;4:子女;5:父母;6:兄弟姐妹;7:其他亲属;8:朋友;9:同事)

        List<String> relavtives = Lists.newArrayList("MOTHER", "FATHER",
            "SPOUSE", "OTHER");
        Collections.shuffle(relavtives);

        System.err.println(relavtives);
        Map<String, String> relativeMap = Splitter.on(",")
            .withKeyValueSeparator("=").split("MOTHER=5,FATHER=5,SPOUSE=3");


        //[@"其他亲属", @"单位", @"子女", @"兄弟姐妹",  @"朋友", @"同事"]
        List<String> otherRelations = Lists.newArrayList("2", "4", "6", "7",
            "8", "9");
        Collections.shuffle(otherRelations);

        for (String string : relavtives) {
            String relation = relativeMap.get(string);
            if (relation != null) {
                System.err.println(string + " : " + relation);
            }
        }
    }

}
