package com.two.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class EncryptorUtil {

    public static void main(String[] args) {

        BasicTextEncryptor bte = new BasicTextEncryptor();

        bte.setPassword("wsnd");

        String username = bte.encrypt("root");
        String password = bte.encrypt("w123");

        System.out.println(username);
        System.out.println(password);

//        rO2 / mVRu0vOw8WSaWKjEhQ ==
//        R46XYr5PM6dGBjrEP51SGw ==

//        1qiBqWEjU1hOxw++QD1IzA==
//        7pHDdqxxJJFgXUSN+AIskw==

    }
}
