package com.leetcode.algorithm.medium.perfectsquares;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
//  public int numSquares(int num) {
//    HashMap<Integer, Integer> map = new HashMap<>();
//    int i = 1;
//    while (i * i <= num) {
//      map.put(i * i, 1);
//      i++;
//    }
//
//    return minNumSquares(num, map);
//  }
//
//  private int minNumSquares(int num, Map<Integer, Integer> map) {
//    if (map.containsKey(num)) {
//      return map.get(num);
//    }
//
//    int sqrt = (int)Math.sqrt(num);
//
//    int min = Integer.MAX_VALUE;
//    for (int i = 1; i <= sqrt; i++) {
//      int value = num - i * i;
//      int count = minNumSquares(value, map);
//      if (count < min) {
//        min = count;
//      }
//    }
//    min += 1;
//    map.put(num, min);
//    return min;
//  }

  public int numSquares(int num) {
    ArrayList<Integer> dp = new ArrayList<>();
    dp.add(0);

    while (dp.size() <= num) {
      int size = dp.size();
      int min = Integer.MAX_VALUE;
      for (int i = 1; i * i <= size; i++) {
        min = Math.min(min, dp.get(size - i * i) + 1);
      }
      dp.add(min);
    }

    return dp.get(num);
  }
}
