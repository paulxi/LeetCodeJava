package com.leetcode.algorithm.medium.longestmountaininarray;

class Solution {
  public int longestMountain(int[] arr) {
    int res = 0;
    int up = 0;
    int down = 0;
    for (int i = 1; i < arr.length; i++) {
      if ((down > 0 && arr[i] > arr[i - 1]) || arr[i - 1] == arr[i]) {
        up = 0;
        down = 0;
      }
      if (arr[i - 1] < arr[i]) {
        up++;
      }
      if (arr[i - 1] > arr[i]) {
        down++;
      }
      if (up > 0 && down > 0 && up + down + 1 > res) {
        res = up + down + 1;
      }
    }

    return res;
  }
}
