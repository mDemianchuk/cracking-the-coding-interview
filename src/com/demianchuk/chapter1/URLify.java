package com.demianchuk.chapter1;

/*
    Write a method to replace all spaces in string with '%20'. You may assume that the string
    has sufficient space at the end to hold the additional characters, and that you are given
    the "true" length of the string.

    Solution:
        Time complexity: O(n), n = length of a string
        Space complexity: O(1)
 */

public class URLify {

    public static void main(String[] args) {
        String test = "I am Mykola               ";
        replaceBlanks(test.toCharArray(), 13);

        test = "Hello world     ";
        replaceBlanks(test.toCharArray(), 11);

        test = "Mr John Smith     ";
        replaceBlanks(test.toCharArray(), 13);
    }

    public static void replaceBlanks(char[] str, int trueLength) {
        int spaceCount = 0;
        for(int i = 0; i < trueLength; i++) {
            if(str[i] == ' ') {
                spaceCount++;
            }
        }
        //number of characters in the new string
        int index = trueLength + spaceCount * 2;

        // end of the array
        if(trueLength < str.length) {
            str[trueLength] = '\0';
        }

        for(int i = trueLength - 1; i >= 0; i--) {
            if(str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }

        System.out.println(str);
    }
}
