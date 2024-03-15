package leetcode.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowelsOfAString {
    public static String reverseVowels(String s) {
        List<Character> list = List.of(
                'a', 'e', 'i', 'o', 'u'
        );
        s.toLowerCase();
        char[] array = s.toCharArray();
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for (char el : array) {
            if (list.contains(el)) {
                list1.add(el);
            }
            list2.add(el);
        }
        Collections.reverse(list1);
        int position = 0;
        for (int i = 0; i < list2.size(); i++) {
            if (list.contains(list2.get(i))) {
                list2.set(i, list1.get(position++));
            }
        }
        StringBuilder sB = new StringBuilder();
        for (char el : list2) {
            sB.append(el);
        }
        return sB.toString();
    }

    public static void main(String[] args) {
        String s = "leetcode";
        String result = reverseVowels(s);
        System.out.println(result);
    }
}