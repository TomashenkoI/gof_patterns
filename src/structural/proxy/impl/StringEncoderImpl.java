package structural.proxy.impl;

import structural.proxy.StringEncoder;

import java.util.Base64;

public class StringEncoderImpl implements StringEncoder {
    @Override
    public String encode(String s) {
        return Base64.getEncoder().encodeToString(s.getBytes());
    }
}
