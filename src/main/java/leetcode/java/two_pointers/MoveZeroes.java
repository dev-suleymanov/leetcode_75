package leetcode.java.two_pointers;

import java.util.Arrays;

/*
    https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75
 */

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int[] array = new int[nums.length];
        int size = 0;
        for (int el : nums) {
            if (el != 0) {
                array[size++] = el;
            }
        }
        System.arraycopy(array, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        int[] nums = {0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
