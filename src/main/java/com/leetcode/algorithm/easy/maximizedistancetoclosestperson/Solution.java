package com.leetcode.algorithm.easy.maximizedistancetoclosestperson;

class Solution {
  public int maxDistToClosest(int[] seats) {
    int i = 0;
    int res = 0;
    int n = seats.length;
    for (int j = 0; j < n; j++) {
      if (seats[j] == 1) {
        if (i == 0) {
          res = j;
        } else {
          res = Math.max(res, (j - i + 1) / 2);
        }

        i = j + 1;
      }
    }

    res = Math.max(res, n - i);
    return res;
  }
}
