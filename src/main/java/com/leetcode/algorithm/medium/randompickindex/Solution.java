package com.leetcode.algorithm.medium.randompickindex;

import java.util.Random;

class Solution {
  int[] nums;
  Random rand;
  public Solution(int[] nums) {
    this.nums = nums;
    this.rand = new Random();
  }

  public int pick(int target) {
    int result = -1;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        count++;
        if (this.rand.nextInt(count) == 0) {
          result = i;
        }
      }
    }

    return result;
  }
}
