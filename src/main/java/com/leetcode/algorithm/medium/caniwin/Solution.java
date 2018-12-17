package com.leetcode.algorithm.medium.caniwin;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
  public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
    if (desiredTotal == 0) {
      return true;
    }
    int sum = maxChoosableInteger * (maxChoosableInteger + 1) / 2;
    if (sum < desiredTotal) {
      return false;
    }
    boolean[] used = new boolean[maxChoosableInteger + 1];
    HashMap<String, Boolean> map = new HashMap<>();

    return helper(map, used, desiredTotal);
  }

  private boolean helper(HashMap<String, Boolean> map, boolean[] used, int total) {
    if (total <= 0) {
      return false;
    }
    String str = Arrays.toString(used);
    if (map.containsKey(str)) {
      return map.get(str);
    }

    for (int i = 1; i < used.length; i++) {
      if (!used[i]) {
        used[i] = true;
        boolean result = helper(map, used, total - i);
        if (!result) {
          map.put(str, true);
          used[i] = false;
          return true;
        }
        used[i] = false;
      }
    }

    map.put(str, false);
    return false;
  }
}
