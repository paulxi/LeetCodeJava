package com.leetcode.algorithm.common;

import java.util.*;

public class UndirectedGraphNode {
  public int label;
  public List<UndirectedGraphNode> neighbors;
  public UndirectedGraphNode(int x) {
    label = x;
    neighbors = new ArrayList<>();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof  UndirectedGraphNode)) {
      return false;
    }

    UndirectedGraphNode other = (UndirectedGraphNode)obj;

    Set<Integer> neighborLabels = new HashSet<>();
    for (UndirectedGraphNode node: neighbors) {
      neighborLabels.add(node.label);
    }

    Set<Integer> otherNeighborLabels = new HashSet<>();
    for (UndirectedGraphNode node: other.neighbors) {
      otherNeighborLabels.add(node.label);
    }

    return label == other.label && Objects.equals(neighborLabels, otherNeighborLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, neighbors);
  }
}
