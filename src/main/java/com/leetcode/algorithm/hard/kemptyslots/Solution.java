package com.leetcode.algorithm.hard.kemptyslots;

class Solution {
  public int kEmptySlots(int[] flowers, int k) {
    int[] days = new int[flowers.length];
    for (int i = 0; i < flowers.length; i++) {
      days[flowers[i] - 1] = i + 1;
    }

    int ans = Integer.MAX_VALUE;
    int left = 0;
    int right = left + k + 1;
    while (right < days.length) {
      int i = left + 1;
      for (; i < right; i++) {
        if (days[right] > days[i]  || days[left] > days[i]) {
          break;
        }
      }

      if (i == right) {
        ans = Math.min(ans, Math.max(days[left], days[right]));
      }

      left = i;
      right = left + k + 1;
    }

    return ans < Integer.MAX_VALUE ? ans : -1;
  }
}
