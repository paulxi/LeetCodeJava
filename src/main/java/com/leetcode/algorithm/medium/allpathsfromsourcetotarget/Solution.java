package com.leetcode.algorithm.medium.allpathsfromsourcetotarget;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<List<Integer>> ans = new ArrayList<>();

    boolean[] visited = new boolean[graph.length];
    visited[0] = true;
    List<Integer> result = new ArrayList<>();
    result.add(0);
    helper(ans, result, graph, visited, 0);

    return ans;
  }

  private void helper(
      List<List<Integer>> ans, List<Integer> result, int[][] graph, boolean[] visited, int index) {
    if (index == graph.length - 1) {
      ans.add(new ArrayList<>(result));
      return;
    }

    for (int j = 0; j < graph[index].length; j++) {
      if (!visited[graph[index][j]]) {
        visited[graph[index][j]] = true;
        result.add(graph[index][j]);

        helper(ans, result, graph, visited, graph[index][j]);

        result.remove(result.size() - 1);
        visited[graph[index][j]] = false;
      }
    }
  }
}
