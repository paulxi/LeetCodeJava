package com.leetcode.algorithm.easy.reshapethematrix;

class Solution {
  public int[][] matrixReshape(int[][] nums, int r, int c) {
    int m = nums.length;
    int n = nums[0].length;

    if (m * n != r * c) {
      return nums;
    }

    int[][] result = new int[r][c];
    int total = m * n;
    for (int i = 0; i < total; i++) {
      int sr = i / n;
      int sc = i % n;

      int tr = i / c;
      int tc = i % c;

      result[tr][tc] = nums[sr][sc];
    }

    return result;
  }
}
