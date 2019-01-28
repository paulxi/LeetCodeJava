package com.leetcode.algorithm.medium.foursum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    int len = nums.length;

    List<List<Integer>> result = new ArrayList<>();

    for (int j = 0; j < len - 3; j++) {
      if (j == 0 || nums[j] != nums[j - 1]) {
        for (int i = j + 1; i < len - 2; i++) {
          if (i == j + 1 || nums[i] != nums[i - 1]) {
            int lo = i + 1;
            int hi = len - 1;
            int sum = target - nums[j] - nums[i];
            while (lo < hi) {
              if (nums[lo] + nums[hi] == sum) {
                result.add(Arrays.asList(nums[j], nums[i], nums[lo], nums[hi]));

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
      }
    }

    return result;
  }
}
