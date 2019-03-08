package com.demianchuk.chapter1;

import java.util.Arrays;

/*
    Given two strings, write a method to decide if one is a permutation of the other.

    Solution:
        Time complexity: O(n log n), n = length of strings
        Space complexity: O(n)
 */


public class CheckPermutation {

    public static void main(String[] args) {
        System.out.println(checkPermutation("abcd", "dcba"));
        System.out.println(checkPermutation("Abcd", "aBcd"));
    }

    public static boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] charArr1 = s1.toCharArray();
        char[] charArr2 = s2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        s1 = new String(charArr1);
        s2 = new String(charArr2);

        return s1.equals(s2);
    }

}
