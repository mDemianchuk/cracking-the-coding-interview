package com.demianchuk.chapter1;

/*
    Solution:
        Time complexity: O(n + 128) -> O(n), n = length of a longer string
        Space complexity: O(128) -> O(1)
 */

public class OneAway {
    public static void main(String[] args) {
        System.out.println(isOneAway("pale", "psle"));
    }

    public static boolean isOneAway(String str1, String str2) {

        int lengthDifference = Math.abs(str1.length() - str2.length());

        if (lengthDifference > 1) {
            return false;
        }

        int allowedDifference = 1;

        if (lengthDifference == 0) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    allowedDifference--;
                }
                if (allowedDifference < 0) {
                    return false;
                }
            }
            return true;
        }

        boolean[] ascii = new boolean[128];

        fillOutAscii(ascii, str1);
        fillOutAscii(ascii, str2);

        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i])
                allowedDifference--;
            if (allowedDifference < 0)
                return false;
        }
        return true;
    }

    private static void fillOutAscii(boolean[] ascii, String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // flip the value
            ascii[currentChar] = !ascii[currentChar];
        }
    }
}
