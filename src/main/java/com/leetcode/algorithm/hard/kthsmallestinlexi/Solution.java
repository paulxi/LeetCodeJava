package com.leetcode.algorithm.hard.kthsmallestinlexi;

class Solution {
  public int findKthNumber(int n, int k) {
    int curr = 1;
    k--;

    while (k > 0) {
      int steps = calSteps(n, curr, curr + 1);
      if (steps <= k) {
        curr++;
        k -= steps;
      } else {
        curr *= 10;
        k--;
      }
    }

    return curr;
  }

  private int calSteps(int n, long n1, long n2) {
    int steps = 0;
    while (n1 <= n) {
      steps += Math.min(n + 1, n2) - n1;
      n1 *= 10;
      n2 *= 10;
    }
    return steps;
  }
}
