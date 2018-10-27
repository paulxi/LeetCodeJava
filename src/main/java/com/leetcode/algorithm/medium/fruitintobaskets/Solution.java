package com.leetcode.algorithm.medium.fruitintobaskets;

class Solution {
  public int totalFruit(int[] tree) {
    int length = tree.length;
    if (length == 0) {
      return 0;
    } else if (length == 1) {
      return 1;
    } else {
      int b1Total = 0;
      int b2Total = 0;
      int maxTotal = 0;

      int b1Index = -1;
      int b2Index = -1;

      for (int i = 0; i < length; i++) {
        if (b1Index == -1 || tree[i] == tree[b1Index]) {
          if (b1Index == -1 || tree[i - 1] != tree[i]) {
            b1Index = i;
          }

          b1Total += 1;
        } else if (b2Index == -1 || tree[i] == tree[b2Index]) {
          if (b2Index == -1 || tree[i - 1] != tree[i]) {
            b2Index = i;
          }

          b2Total += 1;
        } else {
          maxTotal = Math.max(maxTotal, b1Total + b2Total);

          if (tree[i - 1] == tree[b1Index]) {
            b2Index = i;
            b2Total = 1;

            b1Total = i - b1Index;
          } else if (tree[i - 1] == tree[b2Index]) {
            b1Index = i;
            b1Total = 1;

            b2Total = i - b2Index;
          }
        }
      }

      return Math.max(maxTotal, b1Total + b2Total);
    }
  }
}
