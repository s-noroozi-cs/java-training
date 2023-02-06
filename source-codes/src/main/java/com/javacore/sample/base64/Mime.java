package com.javacore.sample.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

public class Mime {

    public static void main(String[] args) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 10; ++i) {
            stringBuilder.append(UUID.randomUUID());
        }

        byte[] mimeBytes = stringBuilder.toString()
                .getBytes(StandardCharsets.UTF_8);
        String mimeEncodedString = Base64.getMimeEncoder()
                .encodeToString(mimeBytes);
        System.out.println("Base64 Encoded String (MIME) :\n"
                + mimeEncodedString);
    }
}
