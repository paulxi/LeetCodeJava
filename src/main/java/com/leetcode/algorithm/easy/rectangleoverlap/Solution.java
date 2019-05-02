package com.leetcode.algorithm.easy.rectangleoverlap;

class Solution {
  public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
    return isOverlap(rec1[0], rec1[2], rec2[0], rec2[2])
        && isOverlap(rec1[1], rec1[3], rec2[1], rec2[3]);
  }

  private boolean isOverlap(int x0, int x1, int x2, int x3) {
    return Math.max(x0, x2) < Math.min(x1, x3);
  }
}
