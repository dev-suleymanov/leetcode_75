package leetcode.java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
    https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75
 */

public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Set<Character> set1 = new HashSet<>();
        for (char el : array1) {
            set1.add(el);
        }
        Set<Character> set2 = new HashSet<>();
        for (char el : array2) {
            set2.add(el);
        }
        set1.retainAll(set2);
        return String.join("", List.of());
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        String result = gcdOfStrings(str1, str2);
        System.out.println(result);
    }
}

/*
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 */