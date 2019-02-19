package com.leetcode.algorithm.easy.floodfill;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    if (sr >= image.length) {
      return image;
    }
    if (sc >= image[0].length) {
      return image;
    }

    int m = image.length;
    int n = image[0].length;

    int oldColor = image[sr][sc];
    if (oldColor == newColor) {
      return image;
    }

    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[] {sr, sc});
    image[sr][sc] = newColor;
    while (!queue.isEmpty()) {
      for (int i = 0; i < queue.size(); i++) {
        int[] pos = queue.poll();
        if (pos[0] > 0 && image[pos[0] - 1][pos[1]] == oldColor) {
          queue.offer(new int[] {pos[0] - 1, pos[1]});
          image[pos[0] - 1][pos[1]] = newColor;
        }

        if (pos[0] < m - 1 && image[pos[0] + 1][pos[1]] == oldColor) {
          queue.offer(new int[] {pos[0] + 1, pos[1]});
          image[pos[0] + 1][pos[1]] = newColor;
        }

        if (pos[1] > 0 && image[pos[0]][pos[1] - 1] == oldColor) {
          queue.offer(new int[] {pos[0], pos[1] - 1});
          image[pos[0]][pos[1] - 1] = newColor;
        }

        if (pos[1] < n - 1 && image[pos[0]][pos[1] + 1] == oldColor) {
          queue.offer(new int[] {pos[0], pos[1] + 1});
          image[pos[0]][pos[1] + 1] = newColor;
        }
      }
    }

    return image;
  }
}
