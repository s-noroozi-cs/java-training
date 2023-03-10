package com.javacore.sample.v8.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Basic {
    public static void main(String args[]) throws Exception {
        String[] originalText = {
                "simple text"
                , "http://google.com/?param1=value1&param2=value2"
                , "123 +++ 321"
        };

        byte[][] base64 = new byte[originalText.length][];
        for (int i = 0; i < base64.length; i++) {
            base64[i] = Base64.getEncoder()
                    .encode(originalText[i]
                            .getBytes(StandardCharsets.UTF_8));
        }

        for (int i = 0; i < base64.length; i++) {
            System.out.println("""
                    original plain    text: %s
                    base64   encoded  text: %s
                    base64   decoded  text: %s
                    """.formatted(
                    originalText[i]
                    ,new String(base64[i],StandardCharsets.UTF_8)
                    , new String(Base64.getDecoder()
                            .decode(base64[i]), StandardCharsets.UTF_8)
            ));
        }

    }
}
