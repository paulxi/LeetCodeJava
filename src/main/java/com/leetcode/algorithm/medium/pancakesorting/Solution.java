package com.leetcode.algorithm.medium.pancakesorting;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> pancakeSort(int[] nums) {
    List<Integer> ans = new ArrayList<>();
    for (int x = nums.length; x >= 1; x--) {
      int i = 0;
      while (nums[i] != x) {
        i++;
      }
      reverse(nums, i + 1);
      ans.add(i + 1);
      reverse(nums, x);
      ans.add(x);
    }

    return ans;
  }

  private void reverse(int[] nums, int k) {
    int i = 0;
    int j = k - 1;
    while (i < j) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
      i++;
      j--;
    }
  }
}
