package com.leetcode.algorithm.medium.minimumswapstomakesequencesincreasing;

class Solution {
  public int minSwap(int[] a, int[] b) {
    int n = a.length;
    int[] swap = new int[1000];
    int[] not_swap = new int[1000];
    swap[0] = 1;
    for (int i = 1; i < n; i++) {
      swap[i] = n;
      not_swap[i] = n;
      if (a[i - 1] < a[i] && b[i - 1] < b[i]) {
        not_swap[i] = not_swap[i - 1];
        swap[i] = swap[i - 1] + 1;
      }
      if (a[i - 1] < b[i] && b[i - 1] < a[i]) {
        not_swap[i] = Math.min(not_swap[i], swap[i - 1]);
        swap[i] = Math.min(swap[i], not_swap[i - 1] + 1);
      }
    }
    return Math.min(swap[n - 1], not_swap[n - 1]);
  }
}
