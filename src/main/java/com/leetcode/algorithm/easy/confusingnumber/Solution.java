package com.leetcode.algorithm.easy.confusingnumber;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public boolean confusingNumber(int n) {
    int num = n;
    int max = Integer.MAX_VALUE;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 0);
    map.put(1, 1);
    map.put(6, 9);
    map.put(8, 8);
    map.put(9, 6);

    int newN = 0;
    while (num != 0) {
      int m = num % 10;
      if (!map.containsKey(m)) {
        return false;
      }

      if (newN == max / 10 && m > max % 10) {
        return false;
      }

      newN = newN * 10 + map.get(m);
      num /= 10;
    }

    return newN != n;
  }
}
