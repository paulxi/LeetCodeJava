package com.leetcode.algorithm.medium.sorttransformedarray;

class Solution {
  public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
    int n = nums.length;
    int[] sorted = new int[n];
    int i = 0;
    int j = n - 1;
    int index = a >= 0 ? n - 1 : 0;

    while (i <= j) {
      int q1 = quad(nums[i], a, b, c);
      int q2 = quad(nums[j], a, b, c);

      if (a >= 0) {
        if (q1 >= q2) {
          sorted[index] = q1;
          i++;
        } else {
          sorted[index] = q2;
          j--;
        }
        index--;
      } else {
        if (q1 >= q2) {
          sorted[index] = q2;
          j--;
        } else {
          sorted[index] = q1;
          i++;
        }

        index++;
      }
    }

    return sorted;
  }

  private int quad(int x, int a, int b, int c) {
    return a * x * x + b * x + c;
  }
}
