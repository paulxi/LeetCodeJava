package com.leetcode.algorithm.medium.permutationsequence;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public String getPermutation(int n, int k) {
    List<Integer> nums = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      nums.add(i);
    }

    int[] factorial = new int[n + 1];
    factorial[0] = 1;
    for (int i = 1; i <= n; i++) {
      factorial[i] = factorial[i - 1] * i;
    }

    StringBuilder sb = new StringBuilder();
    k--;

    for (int i = 1; i <= n; i++) {
      int index = k / factorial[n - i];
      sb.append(nums.get(index));
      nums.remove(index);
      k -= index * factorial[n - i];
    }

    return sb.toString();
  }
}
