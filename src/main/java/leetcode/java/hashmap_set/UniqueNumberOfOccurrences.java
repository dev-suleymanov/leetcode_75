package leetcode.java.hashmap_set;

import java.util.HashSet;
import java.util.Set;

/*
    https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=study-plan-v2&envId=leetcode-75
 */

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int el : arr) {
            set.add(el);
        }
        return set.size() < arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        boolean result = uniqueOccurrences(arr);
        System.out.println(result);
    }
}
