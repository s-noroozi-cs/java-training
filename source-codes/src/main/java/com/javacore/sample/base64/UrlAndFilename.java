package com.javacore.sample.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class UrlAndFilename {

    public static void main(String args[]) throws Exception {
        String[] originalText = {
                "simple text"
                , "http://google.com/?param1=value1&param2=value2"
                ,"https://www.google.co.nz/?gfe_rd=cr&ei=dzbFV&gws_rd=ssl#q=java"
                , "123 +++ 321"
        };

        byte[][] base64 = new byte[originalText.length][];
        for (int i = 0; i < base64.length; i++) {
            base64[i] = Base64.getUrlEncoder()
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
                    , new String(Base64.getUrlDecoder()
                            .decode(base64[i]), StandardCharsets.UTF_8)
            ));
        }

    }
}
