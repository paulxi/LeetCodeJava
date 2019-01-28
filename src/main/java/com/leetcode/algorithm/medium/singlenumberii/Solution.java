package com.leetcode.algorithm.medium.singlenumberii;

class Solution {
//  public int singleNumber(int[] nums) {
    // https://leetcode.com/problems/single-number-ii/discuss/43297/Java-O(n)-easy-to-understand-solution-easily-extended-to-any-times-of-occurance
//    int ans = 0;
//    for (int i = 0; i < 32; i++) {
//      int sum = 0;
//      for (int j = 0; j < nums.length; j++) {
//        if (((nums[j] >> i) & 1) == 1) {
//          sum++;
//        }
//      }
//      sum %= 3;
//      ans |= sum << i;
//    }
//
//    return ans;
//  }

  public int singleNumber(int[] nums) {
    // https://leetcode.com/problems/single-number-ii/discuss/43296/An-General-Way-to-Handle-All-this-sort-of-questions.
    int a = 0;
    int b = 0;

    for (int num: nums) {
      int t = (a & (~b) & (~num)) | ((~a) & b & num);
      b = ((~a) & (b) & (~num)) | ((~a) & (~b) & num);
      a = t;
    }

    return a | b;
  }
}
