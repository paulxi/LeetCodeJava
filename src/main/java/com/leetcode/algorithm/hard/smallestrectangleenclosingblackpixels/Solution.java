package com.leetcode.algorithm.hard.smallestrectangleenclosingblackpixels;

class Solution {
  public int minArea(char[][] image, int x, int y) {
    int m = image.length;
    int n = image[0].length;

    int left = searchColumns(image, 0, y, 0, m, true);
    int right = searchColumns(image, y + 1, n, 0, m, false);
    int top = searchRows(image, 0, x, left, right, true);
    int bottom = searchRows(image, x + 1, m, left, right, false);

    return (right - left) * (bottom - top);
  }

  private int searchColumns(char[][] image, int i, int j, int top, int bottom, boolean whiteToBlack) {
    while (i != j) {
      int k = top;
      int mid = (i + j) / 2;
      while (k < bottom && image[k][mid] == '0') {
        k++;
      }
      if (k < bottom == whiteToBlack) {
        j = mid;
      } else {
        i = mid + 1;
      }
    }

    return i;
  }

  private int searchRows(char[][] image, int i, int j, int left, int right, boolean whiteToBlack) {
    while (i != j) {
      int k = left;
      int mid = (i + j) / 2;
      while (k < right && image[mid][k] == '0') {
        k++;
      }

      if (k < right == whiteToBlack) {
        j = mid;
      } else {
        i = mid + 1;
      }
    }

    return i;
  }
}
