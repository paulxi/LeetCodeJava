package com.leetcode.algorithm.medium.majorityelementii;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> majorityElement(int[] nums) {
    ArrayList<Integer> result = new ArrayList<>();
    if (nums.length == 0) {
      return result;
    }

    int count1 = 0;
    int count2 = 0;
    int candidate1 = nums[0];
    int candidate2 = nums[0];

    for (int num: nums) {
      if (candidate1 == num) {
        count1++;
      } else if (candidate2 == num) {
        count2++;
      } else if (count1 == 0) {
        candidate1 = num;
        count1++;
      } else if (count2 == 0) {
        candidate2 = num;
        count2++;
      } else {
        count1--;
        count2--;
      }
    }

    count1 = 0;
    count2 = 0;
    for (int num: nums) {
      if (num == candidate1) {
        count1++;
      } else if (num == candidate2) {
        count2++;
      }
    }

    if (count1 > nums.length / 3) {
      result.add(candidate1);
    }
    if (count2 > nums.length / 3) {
      result.add(candidate2);
    }

    return result;
  }
}
