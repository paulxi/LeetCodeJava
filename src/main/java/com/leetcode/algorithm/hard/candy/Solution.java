package com.leetcode.algorithm.hard.candy;

import java.util.Arrays;

class Solution {
  public int candy(int[] ratings) {
    if (ratings.length <= 1) {
      return ratings.length;
    }

    int[] candies = new int[ratings.length];
    int count = 0;
    Arrays.fill(candies, 1);

    for (int i = 1; i < ratings.length; i++) {
      if (ratings[i] > ratings[i - 1]) {
        candies[i] = candies[i - 1] + 1;
      }
    }

    for (int i = ratings.length - 2; i >= 0; i--) {
      if (ratings[i] > ratings[i + 1]) {
        candies[i] = Math.max(candies[i], candies[i + 1] + 1);
      }
    }

    for (int value: candies) {
      count += value;
    }
    return count;
  }
}
