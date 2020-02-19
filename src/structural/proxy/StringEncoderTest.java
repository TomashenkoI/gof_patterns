package structural.proxy;

import org.junit.jupiter.api.Test;
import structural.proxy.impl.CacheableStringEncoder;

class StringEncoderTest {

    @Test
    void test() {
        StringEncoder stringEncoder = new CacheableStringEncoder();
        String str = "str";

        long start = System.nanoTime();
        stringEncoder.encode(str);
        System.out.println("first time encoding took " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        stringEncoder.encode(str);
        System.out.println("second time encoding took " + (System.nanoTime() - start) + "ns");
    }

}