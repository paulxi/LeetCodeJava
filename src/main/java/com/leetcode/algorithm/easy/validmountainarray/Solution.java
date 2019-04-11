package com.leetcode.algorithm.easy.validmountainarray;

class Solution {
//  public boolean validMountainArray(int[] nums) {
//    boolean greater = true;
//
//    for (int i = 1; i < nums.length; i++) {
//      if (greater) {
//        if (nums[i] < nums[i - 1]) {
//          if (i == 1) {
//            return false;
//          }
//          greater = false;
//        }
//      } else {
//        if (nums[i] >= nums[i - 1]) {
//          return false;
//        }
//      }
//    }
//
//    return !greater;
//  }

  public boolean validMountainArray(int[] nums) {
    int len = nums.length;
    int i = 0;
    int j = nums.length - 1;

    while (i + 1 < len && nums[i] < nums[i + 1]) {
      i++;
    }

    while (j > 0 && nums[j - 1] > nums[j]) {
      j--;
    }

    return i > 0 && i == j && j < len - 1;
  }
}
