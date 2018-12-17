package com.leetcode.algorithm.medium.friendcircles;

import java.util.*;

class Solution {
  public int findCircleNum(int[][] matrix) {
    int result = 0;

    if (matrix.length == 0) {
      return result;
    }

    int[] visited = new int[matrix.length];
    Queue<Integer> queue = new LinkedList<>();

    for (int i = 0; i < matrix.length; i++) {
      if (visited[i] == 0) {
        queue.add(i);
        while (!queue.isEmpty()) {
          int s = queue.remove();
          visited[s] = 1;
          for (int j = 0; j < matrix.length; j++) {
            if (matrix[s][j] == 1 && visited[j] == 0) {
              queue.add(j);
            }
          }
        }
        result++;
      }
    }

    return result;
  }
}
