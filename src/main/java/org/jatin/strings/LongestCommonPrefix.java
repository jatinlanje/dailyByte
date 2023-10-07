package org.jatin.strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"spot", "spotty", "spotted"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        int count = 0;
        String first = strs[0];
        String last = strs[strs.length - 1];
        while (count < first.length()) {
            if (first.charAt(count) == last.charAt(count)) {
                count++;
            } else {
                break;
            }
        }
        return count == 0 ? "" : first.substring(0, count);
    }
}
