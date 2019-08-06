package com.leetcode.algorithm.medium.circulararrayloop;

class Solution {
  public boolean circularArrayLoop(int[] nums) {
    int n = nums.length;
    if (n < 2) {
      return false;
    }

    for (int i = 0; i < n; i++) {
      if (nums[i] == 0) {
        continue;
      }

      int j = i, k = getIndex(i, nums);
      while (nums[k] * nums[i] > 0 && nums[getIndex(k, nums)] * nums[i] > 0) {
        if (j == k) {
          if (j == getIndex(j, nums)) {
            break;
          }
          return true;
        }

        j = getIndex(j, nums);
        k = getIndex(getIndex(k, nums), nums);
      }

      j = i;
      int val = nums[i];
      while (nums[j] * val > 0) {
        int next = getIndex(j, nums);
        nums[j] = 0;
        j = next;
      }
    }

    return false;
  }

  private int getIndex(int i, int[] nums) {
    int n = nums.length;

    return i + nums[i] >= 0 ? (i + nums[i]) % n : n + ((i + nums[i]) % n);
  }
}
