package leetcode.java.array.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75
 */

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        StringBuilder sB = new StringBuilder();
        s = s.trim();
        List<String> list = new ArrayList<>();
        for (String el : s.split(" ")) {
            if (!el.equals("")) {
                list.add(el);
            }
        }
        Collections.reverse(list);
        for (String el : list) {
            sB.append(el + " ");
        }
        String result = sB.toString();
        result = result.trim();
        return result;
    }

    public static void main(String[] args) {
        String s = "a good   example";
        String result = reverseWords(s);
        System.out.println(result);
    }
}
