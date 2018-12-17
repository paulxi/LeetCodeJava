package com.leetcode.algorithm.easy.flippinganimage;

class Solution {
  public int[][] flipAndInvertImage(int[][] image) {
    for (int i = 0; i < image.length; i++) {
      int low = 0;
      int high = image[i].length - 1;
      while (low < high) {
        if (image[i][low] == image[i][high]) {
          image[i][low] = image[i][low] == 0 ? 1 : 0;
          image[i][high] = image[i][low];
        }

        low += 1;
        high -= 1;
      }
      if (low == high) {
        image[i][low] = image[i][low] == 0 ? 1 : 0;
      }
    }

    return image;
  }
}
