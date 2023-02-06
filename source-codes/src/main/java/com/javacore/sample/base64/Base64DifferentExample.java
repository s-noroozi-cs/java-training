package com.javacore.sample.base64;

import java.util.Base64;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Base64DifferentExample {

    public static void main(String[] args) {
        urlSaferVsBasic();
        mimeVsBasic();
    }

    private static void urlSaferVsBasic() {
        Base64.Encoder enc = Base64.getEncoder();
        Base64.Encoder encURL = Base64.getUrlEncoder();

        byte[] bytes = enc.encode("subjects?_d".getBytes());
        byte[] bytesURL = encURL.encode("subjects?_d".getBytes());

        //notice the "/"
        //notice the "_"
        System.out.println("""
                basic:    %s
                url safe: %s 
                """
                .formatted(
                        new String(bytes)
                        , new String(bytesURL)));
    }

    private static void mimeVsBasic() {
        Base64.Encoder enc = Base64.getEncoder();
        Base64.Encoder encMime = Base64.getMimeEncoder();

        String largeText = IntStream.range(0, 100)
                .mapToObj(i -> i + ":" + UUID.randomUUID())
                .collect(Collectors.joining());
        byte[] bytes = enc.encode(largeText.getBytes());
        byte[] bytesMime = encMime.encode(largeText.getBytes());

        // notice new line
        System.out.println("""
                basic: %s
                mime : %s
                """
                .formatted(
                        new String(bytes)
                        , new String(bytesMime)));
    }
}
