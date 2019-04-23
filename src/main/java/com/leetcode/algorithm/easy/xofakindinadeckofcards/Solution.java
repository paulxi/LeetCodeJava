package com.leetcode.algorithm.easy.xofakindinadeckofcards;

class Solution {
  public boolean hasGroupsSizeX(int[] deck) {
    int[] count = new int[10000];
    for (int num : deck) {
      count[num]++;
    }

    int g = -1;

    for (int i = 0; i < count.length; i++) {
      if (count[i] > 0) {
        if (g == -1) {
          g = count[i];
        } else {
          g = gcd(g, count[i]);
        }
      }
    }

    return g >= 2;
  }

  private int gcd(int x, int y) {
    return x == 0 ? y : gcd(y % x, x);
  }
}
