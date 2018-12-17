package com.leetcode.algorithm.easy.canplaceflowers;

class Solution {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    if (n == 0) {
      return true;
    }

    int count = 0;
    for (int i = 0; i < flowerbed.length; i++) {
      int value = flowerbed[i];
      if (value == 0) {
        if (i == 0 && i == flowerbed.length - 1) {
          flowerbed[i] = 1;
          count++;
        } else if (i == 0) {
          if (flowerbed[i + 1] == 0) {
            flowerbed[i] = 1;
            count++;
          }
        } else if (i == flowerbed.length - 1) {
          if (flowerbed[i - 1] == 0) {
            flowerbed[i] = 1;
            count++;
          }
        } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
          flowerbed[i] = 1;
          count++;
        }
      }

      if (count == n) {
        return true;
      }
    }

    return false;
  }
}
