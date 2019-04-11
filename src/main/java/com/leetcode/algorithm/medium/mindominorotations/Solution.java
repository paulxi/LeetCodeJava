package com.leetcode.algorithm.medium.mindominorotations;

class Solution {
  public int minDominoRotations(int[] a, int[] b) {
    if (a.length != b.length) {
      return -1;
    }

    for (int i = 0, count1 = 0, count2 = 0; i < a.length; i++) {
      if (a[i] != a[0] && b[i] != a[0]) {
        break;
      }
      if (a[i] != a[0]) {
        count1++;
      }
      if (b[i] != a[0]) {
        count2++;
      }

      if (i == a.length - 1) {
        return Math.min(count1, count2);
      }
    }

    for (int i = 0, count1 = 0, count2 = 0; i < b.length; i++) {
      if (a[i] != b[0] && b[i] != b[0]) {
        break;
      }
      if (a[i] != b[0]) {
        count1++;
      }
      if (b[i] != b[0]) {
        count2++;
      }

      if (i == b.length - 1) {
        return Math.min(count1, count2);
      }
    }


    return -1;
  }
}
