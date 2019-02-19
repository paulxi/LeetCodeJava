package com.leetcode.algorithm.medium.themazeii;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public int shortestDistance(int[][] maze, int[] start, int[] destination) {
    int m = maze.length;
    int n = maze[0].length;
    int[][] distance = new int[m][n];
    for (int[] row: distance) {
      Arrays.fill(row, Integer.MAX_VALUE);
    }
    distance[start[0]][start[1]] = 0;
    int[][] dirs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[] {start[0], start[1]});
    while (!queue.isEmpty()) {
      int[] s = queue.poll();

      for (int[] dir: dirs) {
        int x = s[0] + dir[0];
        int y = s[1] + dir[1];
        int count = 0;

        while (x >= 0 && x < m && y >= 0 && y < n && maze[x][y] == 0) {
          x += dir[0];
          y += dir[1];
          count++;
        }

        x -= dir[0];
        y -= dir[1];

        if (distance[s[0]][s[1]] + count < distance[x][y]) {
          distance[x][y] = distance[s[0]][s[1]] + count;
          queue.offer(new int[] {x, y});
        }
      }
    }

    return distance[destination[0]][destination[1]] == Integer.MAX_VALUE ? -1 :
        distance[destination[0]][destination[1]];
  }
}
