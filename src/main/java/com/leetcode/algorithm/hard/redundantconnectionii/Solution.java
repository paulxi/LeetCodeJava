package com.leetcode.algorithm.hard.redundantconnectionii;

import java.util.*;

class Solution {
//  static class DSU {
//    int[] parent;
//    int[] rank;
//
//    DSU(int size) {
//      parent = new int[size];
//      for (int i = 0; i < size;i++) {
//        parent[i] = i;
//      }
//      rank = new int[size];
//    }
//
//    int find(int x) {
//      if (parent[x] != x) {
//        parent[x] = find(parent[x]);
//      }
//
//      return parent[x];
//    }
//
//    boolean union(int x, int y) {
//      int xr = find(x);
//      int yr = find(y);
//      if (xr == yr) {
//        return false;
//      }
//
//      if (rank[xr] < rank[yr]) {
//        parent[xr] = yr;
//      } else if (rank[xr] > rank[yr]) {
//        parent[yr] = xr;
//      } else {
//        parent[yr] = xr;
//        rank[xr]++;
//      }
//
//      return true;
//    }
//  }
//
//  private int[] findRedundantConnection(int[][] edges, int skip) {
//    DSU dsu = new DSU(1001);
//    int i = 0;
//    for (int[] edge: edges) {
//      if (i != skip) {
//        if (!dsu.union(edge[0], edge[1])) {
//          return edge;
//        }
//      }
//      i++;
//    }
//
//    return null;
//  }
//
//  public int[] findRedundantDirectedConnection(int[][] edges) {
//    HashMap<Integer, Integer> incoming = new HashMap<>();
//
//    int nodeWithTwoIncomingEdges = -1;
//    for (int[] edge: edges) {
//      incoming.put(edge[1], incoming.getOrDefault(edge[1], 0) + 1);
//      if (incoming.get(edge[1]) == 2) {
//        nodeWithTwoIncomingEdges = edge[1];
//      }
//    }
//
//    if (nodeWithTwoIncomingEdges == -1) {
//      return findRedundantConnection(edges, -1);
//    } else {
//      for (int i = edges.length - 1; i >= 0; i--) {
//        if (edges[i][1] == nodeWithTwoIncomingEdges) {
//          if (findRedundantConnection(edges, i) == null) {
//            return edges[i];
//          }
//        }
//      }
//    }
//
//    return null;
//  }

  static class OrbitResult {
    int node;
    Set<Integer> seen;

    OrbitResult(int n, Set<Integer> s) {
      node = n;
      seen = s;
    }
  }

  public int[] findRedundantDirectedConnection(int[][] edges) {
    int n = edges.length;
    Map<Integer, Integer> parent = new HashMap<>();
    List<int[]> candidates = new ArrayList<>();
    for (int[] edge: edges) {
      if (parent.containsKey(edge[1])) {
        candidates.add(new int[] {parent.get(edge[1]), edge[1]});
        candidates.add(edge);
      } else {
        parent.put(edge[1], edge[0]);
      }
    }

    int root = orbit(1, parent).node;
    if (candidates.isEmpty()) {
      Set<Integer> cycle = orbit(root, parent).seen;
      int[] ans = new int[] {0, 0};
      for (int[] edge: edges) {
        if (cycle.contains(edge[0]) && cycle.contains(edge[1])) {
          ans = edge;
        }
      }
      return ans;
    }

    Map<Integer, List<Integer>> children = new HashMap<>();
    for (int v: parent.keySet()) {
      int pv = parent.get(v);
      if (!children.containsKey(pv)) {
        children.put(pv, new ArrayList<>());
      }
      children.get(pv).add(v);
    }

    boolean[] seen = new boolean[n + 1];
    seen[0] = true;
    Stack<Integer> stack = new Stack<>();
    stack.add(root);
    while (!stack.isEmpty()) {
      int node = stack.pop();
      if (!seen[node]) {
        seen[node] = true;
        if (children.containsKey(node)) {
          for (int c: children.get(node)) {
            stack.push(c);
          }
        }
      }
    }

    for (boolean b: seen) {
      if (!b) {
        return candidates.get(0);
      }
    }
    return candidates.get(1);
  }

  private OrbitResult orbit(int node, Map<Integer, Integer> parent) {
    Set<Integer> seen = new HashSet<>();
    while (parent.containsKey(node) && !seen.contains(node)) {
      seen.add(node);
      node = parent.get(node);
    }

    return new OrbitResult(node, seen);
  }
}
