package com.leetcode.algorithm.easy.squaresofasortedarray;

class Solution {
  public int[] sortedSquares(int[] arr) {
    int[] ans = new int[arr.length];
    int i = 0;
    int j = arr.length - 1;

    for (int p = arr.length - 1; p >= 0; p--) {
      if (Math.abs(arr[i]) > Math.abs(arr[j])) {
        ans[p] = arr[i] * arr[i];
        i++;
      } else {
        ans[p] = arr[j] * arr[j];
        j--;
      }
    }

    return ans;
  }
}
