package com.leetcode.algorithm.hard.aliendictionary;

import java.util.Arrays;

class Solution {
  private final static int N = 26;

  public String alienOrder(String[] words) {
    int[] visited = new int[N];
    Arrays.fill(visited, -1);
    boolean[][] adj = buildGraph(words, visited);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      if (visited[i] == 0) {
        if (!dfs(adj, visited, sb, i)) {
          return "";
        }
      }
    }

    return sb.reverse().toString();
  }

  private boolean dfs(boolean[][] adj, int[] visited, StringBuilder sb, int i) {
    visited[i] = 1;

    for (int j = 0; j < N; j++) {
      if (adj[i][j]) {
        if (visited[j] == 1) {
          return false;
        }
        if (visited[j] == 0) {
          if (!dfs(adj, visited, sb, j)) {
            return false;
          }
        }
      }
    }

    visited[i] = 2;
    sb.append((char) (i + 'a'));
    return true;
  }

  private boolean[][] buildGraph(String[] words, int[] visited) {
    boolean[][] adj = new boolean[visited.length][visited.length];
    for (int i = 0; i < words.length; i++) {
      for (char c : words[i].toCharArray()) {
        visited[c - 'a'] = 0;
      }
      if (i > 0) {
        int len = Math.min(words[i - 1].length(), words[i].length());
        for (int j = 0; j < len; j++) {
          char c1 = words[i - 1].charAt(j);
          char c2 = words[i].charAt(j);
          if (c1 != c2) {
            adj[c1 - 'a'][c2 - 'a'] = true;
            break;
          }
        }
      }
    }

    return adj;
  }
}
