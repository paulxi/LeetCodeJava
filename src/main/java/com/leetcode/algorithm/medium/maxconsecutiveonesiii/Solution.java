package com.leetcode.algorithm.medium.maxconsecutiveonesiii;

class Solution {
//  public int longestOnes(int[] arr, int k) {
//    int i = 0;
//    int j = 0;
//    for (; j < arr.length; j++) {
//      if (arr[j] == 0) {
//        k--;
//      }
//      if (k < 0) {
//        if (arr[i] == 0) {
//          k++;
//        }
//        i++;
//      }
//    }
//
//    return j - i;
//  }

  public int longestOnes(int[] arr, int k) {
    int zeroCount = 0;
    int start = 0;
    int res = 0;
    for (int end = 0; end < arr.length; end++) {
      if (arr[end] == 0) {
        zeroCount++;
      }

      while (zeroCount > k) {
        if (arr[start] == 0) {
          zeroCount--;
        }
        start++;
      }
      res = Math.max(res, end - start + 1);
    }
    return res;
  }
}
