package org.example.helpers;

import java.util.Arrays;

public class CycleHelper {

    public String reverseString(String string) {
        String reverseString = "";
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            reverseString = chars[i] + reverseString;
        }
        return reverseString;
    }

    public String changeString(String string, char letter, char letterChange) {
        String reverseString = "";
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (aChar == letter) {
                reverseString = reverseString + letterChange;
            } else {
                reverseString = reverseString + aChar;
            }
        }
        return reverseString;
    }

    public String deleteCharFromString(String string, char letter) {
        String reverseString = "";
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (aChar == letter) {
                reverseString = reverseString;
            } else {
                reverseString = reverseString + aChar;
            }
        }
        return reverseString;
    }

    public int howMuchLetterWasUsed(String string, char letter) {
        int count = 0;
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == letter) {
                count++;
            }
        }
        return count;
    }

    public void recurseWithSeparator(String string, int count, String separator) {
        for (int i = 0; i < count; i++) {
            if (i < count - 1) {
                System.out.print(string + separator);
            } else {
                System.out.println(string);
            }
        }
    }

    public boolean isItAPalindrome(String string) {
        String reverseString = "";
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            reverseString = chars[i] + reverseString;
        }
        return reverseString.equals(string);
    }

    public boolean isItAAnagram(String string, String anagram) {
        char[] chars = string.toCharArray();
        char[] charsAnagram = anagram.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(charsAnagram);
        return Arrays.equals(chars, charsAnagram);
    }

    public int fibonachiNumbers(int count) {
        int first = 0;
        int second = 1;
        for (int i = 0; i < count; i++) {
            if (first > second) {
                second = first + second;
            } else {
                first = first + second;
            }
        }
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public int factorialNumbers(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
