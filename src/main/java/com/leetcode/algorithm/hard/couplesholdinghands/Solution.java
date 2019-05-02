package com.leetcode.algorithm.hard.couplesholdinghands;

class Solution {
  public int minSwapsCouples(int[] row) {
    int n = row.length;
    int[] pos = new int[n];
    for (int i = 0; i < n; i++) {
      pos[row[i]] = i;
    }

    int count = 0;
    for (int i = 0; i < n; i += 2) {
      int j = row[i] % 2 == 0 ? row[i] + 1 : row[i] - 1;

      if (row[i + 1] != j) {
        swap(row, pos, i + 1, pos[j]);
        count++;
      }
    }

    return count;
  }

  private void swap(int[] row, int[] pos, int x, int y) {
    int temp = row[x];
    pos[temp] = y;
    pos[row[y]] = x;
    row[x] = row[y];
    row[y] = temp;
  }
}
