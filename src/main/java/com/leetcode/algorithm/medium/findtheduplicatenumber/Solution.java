package com.leetcode.algorithm.medium.findtheduplicatenumber;

class Solution {
  public int findDuplicate(int[] nums) {
    int slow = nums[0];
    int fast = nums[0];

    do {
      fast = nums[nums[fast]];
      slow = nums[slow];
    } while (fast != slow);

    int ptr = nums[0];
    while (ptr != slow) {
      ptr = nums[ptr];
      slow = nums[slow];
    }

    return ptr;
  }
}
