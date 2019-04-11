package com.leetcode.algorithm.medium.longestturbulentsubarray;

class Solution {
  public int maxTurbulenceSize(int[] arr) {
    int inc = 1;
    int dec = 1;
    int ans = 1;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[i - 1]) {
        inc = dec + 1;
        dec = 1;
      } else if (arr[i] < arr[i - 1]) {
        dec = inc + 1;
        inc = 1;
      } else {
        dec = 1;
        inc = 1;
      }

      ans = Math.max(ans, Math.max(inc, dec));
    }

    return ans;
  }
}
