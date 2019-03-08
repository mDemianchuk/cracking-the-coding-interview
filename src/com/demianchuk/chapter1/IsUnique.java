package com.demianchuk.chapter1;

/*
    Implement an algorithm to determine if a string has all unique characters.

    Solution:
        Time complexity: O(n), n = length of a string
        Space complexity: O(128) -> O(1) (assuming given an ascii string)
 */

public class IsUnique {

    public static void main(String[] args) {
        System.out.println(isUnique("abcdef")); // true
        System.out.println(isUnique("abcdabcd")); // false
    }

    public static boolean isUnique(String s) {
        // assuming given an ascii string
        boolean[] ascii = new boolean[128];

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (ascii[currentChar]) {
                return false;
            }
            ascii[currentChar] = true;
        }

        return true;
    }
}
