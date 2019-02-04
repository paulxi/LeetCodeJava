package com.leetcode.algorithm.easy.guessnumberhigherorlower;

import com.leetcode.algorithm.common.GuessGame;

public class Solution extends GuessGame {
  public int guessNumber(int n) {
    int lo = 1;
    int hi = n;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      int result = guess(mid);
      if (result == 0) {
        return mid;
      } else if (result == 1) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }

    return -1;
  }
}
