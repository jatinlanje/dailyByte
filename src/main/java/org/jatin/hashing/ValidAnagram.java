package org.jatin.hashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isValidAnagram(s1, s2));
    }

    private static boolean isValidAnagram(String s1, String s2) {
        if (s1.length() == 0 && s2.length() == 0) {
            return true;
        }
        if (s1.length() == 0 || s2.length() == 0) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
        }
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        return map1.equals(map2);
    }
}
