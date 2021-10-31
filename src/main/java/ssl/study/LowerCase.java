package com.supconit.study;

import java.util.Locale;

public class LowerCase {
    public static boolean isAdmin(String userId) {
        return userId.toLowerCase() == "admin";
    }

    public static void main(String[] args) {
        System.out.println(isAdmin("Admin"));
    }
}
