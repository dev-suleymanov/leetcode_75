package leetcode.java;

/*
    https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
 */

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sB = new StringBuilder();
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();
        int position = 0;
        for (char el : array1) {
            sB.append(el);
            if (position < array2.length) {
                sB.append(array2[position++]);
            }
        }
        String result = sB.toString();
        return result.length() == array1.length + array2.length ?
                result : result + word2.substring(position);
    }

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        String result = mergeAlternately(word1, word2);
        System.out.println(result);
    }
}