package com.leetcode.algorithm.easy.peakindexinamountainarray;

class Solution {
  public int peakIndexInMountainArray(int[] a) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      if (a[mid] < a[mid + 1]) {
        lo = mid + 1;
      } else {
        hi = mid;
      }
    }
    return lo;
  }
}
