package com.leetcode.algorithm.hard.optimalaccountbalancing;

import java.util.*;

class Solution {
  public int minTransfers(int[][] transactions) {
    Map<Integer, Integer> personToDebt = new HashMap<>();
    for (int[] t: transactions) {
      personToDebt.put(t[0], personToDebt.getOrDefault(t[0], 0) - t[2]);
      personToDebt.put(t[1], personToDebt.getOrDefault(t[1], 0) + t[2]);
    }

    return settle(0, new ArrayList<>(personToDebt.values()));
  }

  private int settle(int start, List<Integer> debt) {
    while (start < debt.size() && debt.get(start) == 0) {
      start++;
    }

    if (start == debt.size()) {
      return 0;
    }

    int ans = Integer.MAX_VALUE;
    for (int i = start + 1; i < debt.size(); i++) {
      if (debt.get(start) * debt.get(i) < 0) {
        debt.set(i, debt.get(i) + debt.get(start));
        ans = Math.min(ans, 1 + settle(start + 1, debt));
        debt.set(i, debt.get(i) - debt.get(start));
      }
    }

    return ans;
  }
}
