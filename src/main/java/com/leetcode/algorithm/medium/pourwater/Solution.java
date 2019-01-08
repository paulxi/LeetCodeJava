package com.leetcode.algorithm.medium.pourwater;

class Solution {
//  public int[] pourWater(int[] heights, int v, int k) {
//    while (v > 0) {
//      int val = heights[k];
//      int pos = k;
//
//      while (pos > 0 && val >= heights[pos - 1]) {
//        val = heights[pos - 1];
//        pos--;
//      }
//
//      while (pos < heights.length - 1 && val >= heights[pos + 1]) {
//        val = heights[pos + 1];
//        pos++;
//      }
//
//      while (pos > k && heights[pos] >= heights[pos - 1]) {
//        pos--;
//      }
//
//      heights[pos] += 1;
//      v--;
//    }
//
//    return heights;
//  }

  public int[] pourWater(int[] heights, int v, int k) {
    while (v > 0) {
      int index = k;
      for (int i = k - 1; i >= 0; i--) {
        if (heights[i] > heights[index]) {
          break;
        } else if (heights[i] < heights[index]) {
          index = i;
        }
      }

      if (index != k) {
        heights[index]++;
        v--;
        continue;
      }

      for (int i = k + 1; i < heights.length; i++) {
        if (heights[i] > heights[index]) {
          break;
        } else if (heights[i] < heights[index]) {
          index = i;
        }
      }

      heights[index]++;
      v--;
    }

    return heights;
  }
}
