package com.leetcode.algorithm.medium.threesum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new LinkedList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      if (i == 0 || nums[i] != nums[i - 1]) {
        int lo = i + 1;
        int hi = nums.length - 1;
        int sum = 0 - nums[i];

        while (lo < hi) {
          if (nums[lo] + nums[hi] == sum) {
            result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
            while (lo < hi && nums[lo] == nums[lo + 1]) {
              lo++;
            }
            while (lo < hi && nums[hi] == nums[hi - 1]) {
              hi--;
            }
            lo++;
            hi--;
          } else if (nums[lo] + nums[hi] < sum) {
            lo++;
          } else {
            hi--;
          }
        }
      }
    }

    return result;
  }
}