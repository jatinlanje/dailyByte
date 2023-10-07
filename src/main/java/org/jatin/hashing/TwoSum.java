package org.jatin.hashing;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {4, 2, 6, 5, 2};
        int k = 4;
        System.out.println(twoSum(arr, k));
    }

    private static boolean twoSum(int[] arr, int k) {
        int n = arr.length;
        if (n < 2) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        // arr[i] + arr[j] = k
        for (int i = 0; i < n; i++) {
            int sum = k - arr[i];
            if (set.contains(sum)) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;
    }
}
