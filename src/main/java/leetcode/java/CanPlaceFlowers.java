package leetcode.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        List<Integer> list = new ArrayList<>();
        for (int el : flowerbed) {
            list.add(el);
        }
        for (int i = 0; i < n; i++) {
            list.add(1);
        }
        int zeros = 0;
        int ones = 0;
        for (Integer el : list) {
            if (el == 0) {
                zeros++;
            } else {
                ones++;
            }
        }
        return zeros == ones;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean result = canPlaceFlowers(flowerbed, n);
        System.out.println(result);
    }
}


/*
Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false

 */