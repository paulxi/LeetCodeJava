package com.leetcode.algorithm.medium.beautifularray;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] beautifulArray(int n) {
    List<Integer> res = new ArrayList<>();
    res.add(1);
    while (res.size() < n) {
      List<Integer> temp = new ArrayList<>();
      for (int i: res) {
        if (i * 2 - 1 <= n) {
          temp.add(i * 2 - 1);
        }
      }
      for (int i : res) {
        if (i * 2 <= n) {
          temp.add(i * 2);
        }
      }
      res = temp;
    }

    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
      ans[i] = res.get(i);
    }
    return ans;
  }
}
