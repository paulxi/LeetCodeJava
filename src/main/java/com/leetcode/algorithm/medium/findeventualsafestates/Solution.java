package com.leetcode.algorithm.medium.findeventualsafestates;

import java.util.*;

class Solution {
//  public List<Integer> eventualSafeNodes(int[][] graph) {
//    int n = graph.length;
//    boolean[][] matrix = new boolean[n][n];
//    int[] outdegrees = new int[n];
//
//    for (int i = 0; i < n; i++) {
//      for (int j: graph[i]) {
//        matrix[i][j] = true;
//        outdegrees[i]++;
//      }
//    }
//
//    Queue<Integer> queue = new LinkedList<>();
//    for (int i = 0; i < n; i++) {
//      if (outdegrees[i] == 0) {
//        queue.offer(i);
//      }
//    }
//
//    List<Integer> ans = new ArrayList<>();
//    while (!queue.isEmpty()) {
//      int to = queue.poll();
//      ans.add(to);
//
//      for (int from = 0; from < n; from++) {
//        if (matrix[from][to] && outdegrees[from] > 0) {
//          outdegrees[from]--;
//          if (outdegrees[from] == 0) {
//            queue.offer(from);
//          }
//        }
//      }
//    }
//
//    Collections.sort(ans);
//    return ans;
//  }

  public List<Integer> eventualSafeNodes(int[][] graph) {
    int n = graph.length;
    int[] visited = new int[n]; // 0 - not visited, 1 - in visiting (or cycle), 2 - visited (no cycle)

    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (dfs(graph, visited, i)) {
        ans.add(i);
      }
    }

    return ans;
  }

  private boolean dfs(int[][] graph, int[] visited, int start) {
    if (visited[start] != 0) {
      return visited[start] == 2;
    }

    visited[start] = 1;
    for (int to: graph[start]) {
      if (!dfs(graph, visited, to)) {
        return false;
      }
    }

    visited[start] = 2;
    return true;
  }
}
