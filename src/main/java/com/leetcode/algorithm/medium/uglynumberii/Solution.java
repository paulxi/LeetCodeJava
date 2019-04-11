package com.leetcode.algorithm.medium.uglynumberii;

class Solution {
  public int nthUglyNumber(int n) {
    int[] nums = new int[n];
    nums[0] = 1;
    int fact2 = 2;
    int fact3 = 3;
    int fact5 = 5;
    int index2 = 0;
    int index3 = 0;
    int index5 = 0;
    for (int i = 1; i < n; i++) {
      int min = Math.min(fact2, Math.min(fact3, fact5));
      nums[i] = min;

      if (fact2 == min) {
        index2++;
        fact2 = 2 * nums[index2];
      }

      if (fact3 == min) {
        index3++;
        fact3 = 3 * nums[index3];
      }
      if (fact5 == min) {
        index5++;
        fact5 = 5 * nums[index5];
      }
    }

    return nums[n - 1];
  }
}
