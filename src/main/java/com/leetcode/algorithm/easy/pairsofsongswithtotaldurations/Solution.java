package com.leetcode.algorithm.easy.pairsofsongswithtotaldurations;

import java.util.HashMap;
import java.util.Map;

class Solution {
//  public int numPairsDivisibleBy60(int[] time) {
//    Map<Integer, Integer> map = new HashMap<>();
//
//    int ans = 0;
//    for (int i = 0; i < time.length; i++) {
//      int mod = time[i] % 60;
//      int diff = (60 - mod) % 60;
//      if (map.containsKey(diff)) {
//        ans += map.get(diff);
//      }
//
//      map.put(mod, map.getOrDefault(mod, 0) + 1);
//    }
//
//    return ans;
//  }

  public int numPairsDivisibleBy60(int[] time) {
    int[] c = new int[60];
    int ans = 0;
    for (int t: time) {
      int mod = t % 60;
      ans += c[(60 - mod) % 60];
      c[mod]++;
    }
    return ans;
  }
}
