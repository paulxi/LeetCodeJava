package com.leetcode.algorithm.hard.onlinemajorityelementinsubarray;

import java.util.*;

class MajorityChecker {
    Map<Integer, List<Integer>> map = new HashMap<>();

    public MajorityChecker(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], new ArrayList<>());
            }
            map.get(arr[i]).add(i);
        }
    }

    public int query(int left, int right, int threshold) {
        for (Map.Entry<Integer, List<Integer>> entry: map.entrySet()) {
            List<Integer> indexes = entry.getValue();
            if (indexes.size() < threshold) {
                continue;
            }
            int low = Collections.binarySearch(indexes, left);
            int high = Collections.binarySearch(indexes, right);
            if (low < 0) {
                low = -low - 1;
            }
            if (high < 0) {
                high = (-high - 1) - 1;
            }
            if (high - low + 1 >= threshold) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
