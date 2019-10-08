package com.leetcode.algorithm.medium.deleteandearn;

class Solution {
  public int deleteAndEarn(int[] nums) {
    int[] values = new int[10001];
    for (int num: nums) {
      values[num] += num;
    }
    int take = 0;
    int skip = 0;
    for (int value: values) {
      int temp = Math.max(skip + value, take);
      skip = take;
      take = temp;
    }

    return take;
  }
}
