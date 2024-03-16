package leetcode.java.array.string;

import java.util.ArrayList;
import java.util.List;

/*
    https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
 */

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