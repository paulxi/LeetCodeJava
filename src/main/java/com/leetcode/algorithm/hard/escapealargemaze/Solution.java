package com.leetcode.algorithm.hard.escapealargemaze;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
  static int[][] dirs = new int[][] {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
  static int limit = (int)1e6;

  public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
    Set<String> set = new HashSet<>();
    for (int[] b: blocked) {
      set.add(b[0] + "," + b[1]);
    }

    return bfs(source, target, set) && bfs(target, source, set);
  }

  private boolean bfs(int[] source, int[] target, Set<String> blocks) {
    Set<String> seen = new HashSet<>();
    seen.add(source[0] + "," + source[1]);
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(source);

    while (!queue.isEmpty()) {
      int cur[] = queue.poll();
      for (int[] d: dirs) {
        int x = cur[0] + d[0];
        int y = cur[1] + d[1];
        if (x < 0 || x >= limit || y < 0 || y >= limit) {
          continue;
        }

        String key = x + "," + y;
        if (seen.contains(key) || blocks.contains(key)) {
          continue;
        }
        if (x == target[0] && y == target[1]) {
          return true;
        }
        queue.offer(new int[] {x, y});
        seen.add(key);
      }

      if (seen.size() == 20000) {
        return true;
      }
    }

    return false;
  }
}
