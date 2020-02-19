package structural.proxy.impl;

import structural.proxy.StringEncoder;

import java.util.HashMap;
import java.util.Map;

public class CacheableStringEncoder implements StringEncoder {

    private StringEncoder stringEncoder;
    private Map<String, String> cachedEncodedStrings;

    public CacheableStringEncoder() {
        this.stringEncoder = new StringEncoderImpl();
        this.cachedEncodedStrings = new HashMap<>();
    }

    @Override
    public String encode(String s) {
        if (cachedEncodedStrings.containsKey(s)) {
            return cachedEncodedStrings.get(s);
        }

        String encodedString = stringEncoder.encode(s);

        cachedEncodedStrings.put(s, encodedString);

        return encodedString;
    }
}
