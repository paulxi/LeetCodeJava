package com.leetcode.algorithm.easy.rangesumqueryimmutable;

class NumArray {
  int[] nums;
  int[] bits;
  int n;

  public NumArray(int[] nums) {
    this.nums = nums;
    n = nums.length;
    bits = new int[n + 1];

    for (int i = 0;i < n; i++) {
      bits[i + 1] = nums[i] + bits[i];
    }
  }

  public int sumRange(int i, int j) {
    return bits[j + 1] - bits[i];
  }

//  public NumArray(int[] nums) {
//    this.nums = nums;
//    n = nums.length;
//    bits = new int[n + 1];
//
//    for (int i = 0; i < n; i++) {
//      init(i, nums[i]);
//    }
//  }
//
//  public int sumRange(int i, int j) {
//    return getSum(j) - getSum(i - 1);
//  }
//
//  private void init(int i, int val) {
//    i++;
//    while (i <= n) {
//      bits[i] += val;
//      i += (i & -i);
//    }
//  }
//
//  private int getSum(int i) {
//    i++;
//    int sum = 0;
//    while (i > 0) {
//      sum += bits[i];
//      i -= (i & -i);
//    }
//
//    return sum;
//  }
}
