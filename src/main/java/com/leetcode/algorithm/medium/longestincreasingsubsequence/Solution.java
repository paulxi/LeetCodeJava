package com.leetcode.algorithm.medium.longestincreasingsubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
//  public int lengthOfLIS(int[] nums) {
//    int n = nums.length;
//    if (n == 0) {
//      return 0;
//    }
//    int[] dp = new int[n];
//    dp[0] = 1;
//    int ans = 1;
//    for (int i = 1; i < n; i++) {
//      int max = 0;
//
//      for (int j = 0; j < i; j++) {
//        if (nums[i] > nums[j]) {
//          max = Math.max(max, dp[j]);
//        }
//      }
//
//      dp[i] = max + 1;
//      ans = Math.max(ans, dp[i]);
//    }
//
//    return ans;
//  }

  public int lengthOfLIS(int[] nums) {
    int n = nums.length;
    if (n == 0) {
      return 0;
    }

    int[] tails = new int[n];
    int size = 0;
    for (int x: nums) {
      int i = 0;
      int j = size;
      while (i != j) {
        int m = (i + j) / 2;
        if (tails[m] < x) {
          i = m + 1;
        } else {
          j = m;
        }
      }
      tails[i] = x;
      if (i == size) {
        size++;
      }
    }

    return size;
  }

  public int[] arrayOfLIS(int[] nums) {
    int n = nums.length;
    if (n == 0) {
      return new int[0];
    }

    int size = 0;
    int[] tails = new int[n];
    int[] prevs = new int[n];
    Arrays.fill(prevs, -1);

    for (int i = 0; i < n; i++) {
      int x = nums[i];

      int lo = 0;
      int hi = size;

      while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        int value = nums[tails[mid]];
        if (x > value) {
          lo = mid + 1;
        } else {
          hi = mid;
        }
      }

      tails[lo] = i;
      if (lo == size) {
        size++;
      }

      if (lo > 0) {
        prevs[tails[lo]] = tails[lo - 1];
      }
    }

    List<Integer> list = new ArrayList<>();
    int index = tails[size - 1];
    while (index != -1) {
      list.add(0, nums[index]);
      index = prevs[index];
    }

    int[] ans = new int[list.size()];
    for (int i = 0; i < ans.length; i++) {
      ans[i] = list.get(i);
    }

    return ans;
  }
}
