package com.leetcode.algorithm.hard.subarrayswithkdifferentintegers;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int subarraysWithKDistinct(int[] arr, int k) {
    return atMostK(arr, k) - atMostK(arr, k - 1);
  }

  private int atMostK(int[] arr, int k) {
    int i = 0;
    int res = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int j = 0; j < arr.length; j++) {
      if (map.getOrDefault(arr[j], 0) == 0) {
        k--;
      }
      map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
      while (k < 0) {
        map.put(arr[i], map.get(arr[i]) - 1);
        if (map.get(arr[i]) == 0) {
          k++;
        }
        i++;
      }
      res += j - i + 1;
    }

    return res;
  }
}
