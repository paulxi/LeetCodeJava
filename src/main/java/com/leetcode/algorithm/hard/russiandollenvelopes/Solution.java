package com.leetcode.algorithm.hard.russiandollenvelopes;

import java.util.Arrays;

class Solution {
  public int maxEnvelopes(int[][] envelopes) {
    if (envelopes.length == 0 || envelopes[0].length == 0) {
      return 0;
    }

    Arrays.sort(envelopes, (a, b) -> {
      if (a[0] == b[0]) {
        return b[1] - a[1];
      } else {
        return a[0] - b[0];
      }
    });

    int[] dp = new int[envelopes.length];
    int len = 0;
    for (int[] envelope: envelopes) {
      int index = Arrays.binarySearch(dp, 0, len, envelope[1]);
      if (index < 0) {
        index = -(index + 1);
      }
      dp[index] = envelope[1];
      if (index == len) {
        len++;
      }
    }

    return len;
  }

  public int maxEnvelopes2(int[][] envelopes) {
    if (envelopes.length == 0 || envelopes[0].length == 0) {
      return 0;
    }

    Arrays.sort(envelopes, (a, b) -> {
      if (a[0] == b[0]) {
        return b[1] - a[1];
      } else {
        return a[0] - b[0];
      }
    });

    int m = envelopes.length;
    int[] dp = new int[m];
    int size = 0;
    for (int[] en: envelopes) {
      int lo = 0;
      int hi = size;

      while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (dp[mid] < en[1]) {
          lo = mid + 1;
        } else {
          hi = mid;
        }
      }

      dp[lo] = en[1];
      if (lo == size) {
        size++;
      }
    }

    return size;
  }
}
