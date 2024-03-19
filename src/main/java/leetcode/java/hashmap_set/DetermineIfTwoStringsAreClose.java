package leetcode.java.hashmap_set;

import java.util.Arrays;

/*
    https://leetcode.com/problems/determine-if-two-strings-are-close/?envType=study-plan-v2&envId=leetcode-75
 */

public class DetermineIfTwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {
        char[] array1 = new char[word1.length()];
        char[] array2 = word2.toCharArray();
        int size = 0;
        for (char el : word1.toCharArray()) {
            switch (el) {
                case 'a' :
                    array1[size++] = 'b';
                    break;
                case 'b' :
                    array1[size++] = 'c';
                    break;
                case 'c' :
                    array1[size++] = 'a';
                    break;
            }
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bca";
        boolean result = closeStrings(word1, word2);
        System.out.println(result);
    }
}
