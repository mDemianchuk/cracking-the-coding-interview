package com.demianchuk.chapter1;

/*
    Implement a method to perform basic string compression using the counts
    of repeated characters. For example, the string 'aabcccccaaa' would become 'a2b1c5a3'. If the
    "compressed" string would not become smaller than the original string, your method should return
    the original string. You can assume the string has only uppercase and lowercase letters (a - z).

    Solution:
        Time complexity: O(n), n = length of a string
        Space complexity: O(2n) -> O(n), n = length of a string
 */
public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compressString("aabcccccaaa"));
        System.out.println(compressString("abc"));
    }

    public static String compressString(String str) {

        char[] compressedSrt = new char[str.length() * 2];

        int count = 1;
        int lastIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressedSrt[lastIndex] = str.charAt(i);
                compressedSrt[lastIndex + 1] = Character.forDigit(count, 10);
                lastIndex += 2;
                count = 1;
            }
        }

        if (lastIndex == str.length() * 2)
            return str;

        return new String(compressedSrt);
    }
}
