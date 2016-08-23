package cn.binarywang.tools.generator;

import static com.google.inject.name.Names.named;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Properties;

import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * @author Binary Wang
 */
public class TestConfigModule implements Module {

    @Override
    public void configure(Binder binder) {
        Properties p = new Properties();
        try {
            p.load(new InputStreamReader(ClassLoader
                .getSystemResourceAsStream("test-config.properties")));
        } catch (IOException e) {
            e.printStackTrace();
            assert false;
        }

        Enumeration<Object> e = p.keys();
        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            String value = (String) p.get(key);
            binder.bindConstant().annotatedWith(named("config." + key))
                .to(value);
        }
    }

}
