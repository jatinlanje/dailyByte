package org.jatin.hashing;

import java.util.*;

public class IntersectionOfNumbers {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 3};
        int arr2[] = {3, 3};
        System.out.println(getIntersection(arr1, arr2));
    }

    private static ArrayList<Integer> getIntersection(int[] arr1, int[] arr2) {
        if (arr1.length == 0 || arr2.length == 0) {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (Integer num : arr1) {
            set.add(num);
        }
        for (Integer num : arr2) {
            if (set.contains(num)) {
                list.add(num);
                set.remove(num);
            }
        }
        return list;
    }
}
