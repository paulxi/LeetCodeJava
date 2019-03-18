package com.leetcode.algorithm.hard.splitarraylargestsum;

import java.util.Arrays;

class Solution {
//  public int splitArray(int[] nums, int m) {
//    int n = nums.length;
//    int[][] f = new int[n + 1][m + 1];
//    int[] sub = new int[n + 1];
//    for (int i = 0; i <= n; i++) {
//      Arrays.fill(f[i], Integer.MAX_VALUE);
//    }
//
//    for (int i = 0; i < n; i++) {
//      sub[i + 1] = sub[i] + nums[i];
//    }
//
//    f[0][0] = 0;
//    for (int i = 1; i <= n; i++) {
//      for (int j = 1; j <= m; j++) {
//        for (int k = 0; k < i; k++) {
//          f[i][j] = Math.min(f[i][j], Math.max(f[k][j - 1], sub[i] - sub[k]));
//        }
//      }
//    }
//
//    return f[n][m];
//  }

  public int splitArray(int[] nums, int m) {
    int sum = 0;
    int max = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      max = Math.max(max, nums[i]);
    }

    if (m == 1) {
      return sum;
    }

    int l = max;
    int r = sum;

    while (l < r) {
      int mid = l + (r - l) / 2;
      if (isValid(nums, mid, m)) {
        r = mid;
      } else {
        l = mid + 1;
      }
    }

    return l;
  }

  private boolean isValid(int[] nums, int target, int m) {
    int count = 1;
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (sum > target) {
        sum = nums[i];
        count++;
        if (count > m) {
          return false;
        }
      }
    }

    return true;
  }
}
