package com.leetcode.algorithm.medium.minimumfallingpathsum;

class Solution {
  public int minFallingPathSum(int[][] nums) {
    int min = Integer.MAX_VALUE;

    int m = nums.length;
    int n = nums[0].length;

    for (int i = m - 2; i >= 0; i--) {
      for (int j = 0; j < n; j++) {
        if (j == 0) {
          nums[i][j] += Math.min(nums[i + 1][j], nums[i + 1][j + 1]);
        } else if (j == n - 1) {
          nums[i][j] += Math.min(nums[i + 1][j], nums[i + 1][j - 1]);
        } else {
          nums[i][j] += Math.min(Math.min(nums[i + 1][j], nums[i + 1][j - 1]), nums[i + 1][j + 1]);
        }
      }
    }

    for (int i = 0; i < n; i++) {
      min = Math.min(min, nums[0][i]);
    }

    return min;
  }
}
