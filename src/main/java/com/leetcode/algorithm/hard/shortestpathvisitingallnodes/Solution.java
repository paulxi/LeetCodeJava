package com.leetcode.algorithm.hard.shortestpathvisitingallnodes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
  private final static class State {
    int cover;
    int head;

    State(int cover, int head) {
      this.cover = cover;
      this.head = head;
    }
  }

  public int shortestPathLength(int[][] graph) {
    int n = graph.length;
    Queue<State> queue = new LinkedList<>();
    int[][] dist = new int[1<<n][n];
    for (int[] row: dist) {
      Arrays.fill(row, n * n);
    }

    for (int x = 0; x < n; x++) {
      queue.offer(new State(1<<x, x));
      dist[1<<x][x] = 0;
    }

    while (!queue.isEmpty()) {
      State node = queue.poll();
      int d = dist[node.cover][node.head];
      if (node.cover == (1 << n) - 1) {
        return d;
      }

      for (int child: graph[node.head]) {
        int cover2 = node.cover | (1 << child);
        if (d + 1 < dist[cover2][child]) {
          dist[cover2][child] = d + 1;
          queue.offer(new State(cover2, child));
        }
      }
    }

    return -1;
  }
}
