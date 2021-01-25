package com.leetcode.algorithm.medium.dividearrayinsetsofk;

import java.util.Map;
import java.util.TreeMap;

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int it : map.keySet()) {
            if (map.get(it) > 0) {
                for (int i = k - 1; i >= 0; i--) {
                    if (map.getOrDefault(it + i, 0) < map.get(it)) {
                        return false;
                    }
                    map.put(it + i, map.get(it + i) - map.get(it));
                }
            }
        }
        return true;
    }
}
