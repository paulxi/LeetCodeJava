package com.leetcode.algorithm.medium.prisoncellsafterndays;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] prisonAfterNDays(int[] cells, int n) {
    Map<Integer, Integer> seen = new HashMap<>();

    int state = 0;
    for (int i = 0; i < 8; i++) {
      if (cells[i] > 0) {
        state ^= 1 << i;
      }
    }


    while (n > 0) {
      if (seen.containsKey(state)) {
        n %= seen.get(state) - n;
      }

      seen.put(state, n);

      if (n >= 1) {
        n--;
        state = nextDay(state);
      }
    }

    int[] ans = new int[8];
    for (int i = 0; i < 8; i++) {
      if (((state >> i) & 1) > 0) {
        ans[i] = 1;
      }
    }

    return ans;
  }

  private int nextDay(int state) {
    int ans = 0;

    for (int i = 1; i <= 6; i++) {
      if ((state >> (i - 1) & 1) == ((state >> (i + 1)) & 1)) {
        ans ^= 1 << i;
      }
    }

    return ans;
  }
}
