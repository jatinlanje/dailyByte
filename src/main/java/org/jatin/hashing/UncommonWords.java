package org.jatin.hashing;

import java.util.*;

public class UncommonWords {
    public static void main(String[] args) {
        String s1 = "copper coffee pot";
        String s2 = "hot coffee pot";
        System.out.println(findUncommonWords(s1, s2));
    }

    private static ArrayList<String> findUncommonWords(String s1, String s2) {
        ArrayList<String> list = new ArrayList<>();
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");
        if (arr1.length == 0) {
            return new ArrayList<>(Arrays.asList(arr2));
        }
        if (arr2.length == 0) {
            return new ArrayList<>(Arrays.asList(arr1));
        }
        Set<String> set1 = new HashSet<>();
        for (String str : arr1) {
            set1.add(str);
        }
        for (String str : arr2) {
            if (!set1.contains(str)) {
                list.add(str);
            }
        }
        Set<String> set2 = new HashSet<>();
        for (String str : arr2) {
            set2.add(str);
        }
        for (String str : arr1) {
            if (!set2.contains(str)) {
                list.add(str);
            }
        }
        return list;
    }
}
