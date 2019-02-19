package com.leetcode.algorithm.medium.themaze;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public boolean hasPath(int[][] maze, int[] start, int[] destination) {
    int m = maze.length;
    int n = maze[0].length;

    int[][] dirs = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    boolean[][] visited = new boolean[m][n];
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(start);
    visited[start[0]][start[1]] = true;
    while (!queue.isEmpty()) {
      int[] s = queue.poll();
      if (s[0] == destination[0] && s[1] == destination[1]) {
        return true;
      }

      for (int[] dir: dirs) {
        int x = s[0] + dir[0];
        int y = s[1] + dir[1];

        while (x >= 0 && y >= 0 && x < m && y < n && maze[x][y] == 0) {
          x += dir[0];
          y += dir[1];
        }

        x = x - dir[0];
        y = y - dir[1];
        if (!visited[x][y]) {
          queue.offer(new int[] {x, y});
          visited[x][y] = true;
        }
      }
    }

    return false;
  }
}
