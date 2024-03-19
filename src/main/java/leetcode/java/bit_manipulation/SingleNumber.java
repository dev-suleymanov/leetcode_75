package leetcode.java.bit_manipulation;

/*
    https://leetcode.com/problems/single-number/?envType=study-plan-v2&envId=leetcode-75
 */

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int el : nums) {
            result ^= el;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 2, 1, 2};
        int result = singleNumber(array);
        System.out.println(result);
    }
}
