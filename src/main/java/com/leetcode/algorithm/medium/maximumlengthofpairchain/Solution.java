package com.leetcode.algorithm.medium.maximumlengthofpairchain;

import java.util.Arrays;

class Solution {
  public int findLongestChain(int[][] pairs) {
    if (pairs.length == 0) {
      return 0;
    }
    Arrays.sort(pairs, (a, b) -> a[1] - b[1]);

    int count = 1;
    int prevEnd = pairs[0][1];
    for (int i = 1; i < pairs.length; i++) {
      if (pairs[i][0] > prevEnd) {
        count++;
        prevEnd = pairs[i][1];
      }
    }

    return count;
  }
}
