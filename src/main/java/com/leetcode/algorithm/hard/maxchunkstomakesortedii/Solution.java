package com.leetcode.algorithm.hard.maxchunkstomakesortedii;

import java.util.Arrays;

class Solution {
  public int maxChunksToSorted(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }

    int[] max = new int[arr.length];
    max[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      max[i] = Math.max(arr[i], max[i - 1]);
    }

    int[] sorted = Arrays.copyOf(arr, arr.length);
    Arrays.sort(sorted);
    int ans = 0;
    int upperLimit = Integer.MAX_VALUE;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (max[i] == sorted[i]) {
        if (sorted[i] > upperLimit) {
          continue;
        }

        ans++;
        upperLimit = arr[i];
      }
    }

    return ans;
  }
}
