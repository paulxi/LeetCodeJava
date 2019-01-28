package com.leetcode.algorithm.medium.shuffleanarray;

import java.util.Arrays;
import java.util.Random;

class Solution {
  int[] orig;
  int[] nums;
  Random rand = new Random();

  public Solution(int[] nums) {
    this.nums = nums;
    orig = Arrays.copyOf(nums, nums.length);
  }

  /** Resets the array to its original configuration and return it. */
  public int[] reset() {
    this.nums = Arrays.copyOf(this.orig, this.orig.length);
    return nums;
  }

  /** Returns a random shuffling of the array. */
  public int[] shuffle() {
    for (int i = 0; i < this.nums.length; i++) {
      swapAt(i, randRange(i, this.nums.length));
    }

    return this.nums;
  }

  private void swapAt(int i, int j) {
    int temp = this.nums[i];
    this.nums[i] = this.nums[j];
    this.nums[j] = temp;
  }

  private int randRange(int min, int max) {
    return rand.nextInt(max - min) + min;
  }
}
