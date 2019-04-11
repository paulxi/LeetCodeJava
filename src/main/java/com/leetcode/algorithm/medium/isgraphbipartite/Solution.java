package com.leetcode.algorithm.medium.isgraphbipartite;

import java.util.Arrays;
import java.util.Stack;

class Solution {
  public boolean isBipartite(int[][] graph) {
    int n = graph.length;
    int[] color = new int[n];
    Arrays.fill(color, -1);

    for (int i = 0; i < n; i++) {
      if (color[i] == -1) {
        color[i] = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(i);

        while (!stack.empty()) {
          int node = stack.pop();

          for (int j: graph[node]) {
            if (color[j] == -1) {
              stack.push(j);
              color[j] = color[node] ^ 1;
            } else if (color[j] == color[node]) {
              return false;
            }
          }
        }
      }
    }

    return true;
  }
}
