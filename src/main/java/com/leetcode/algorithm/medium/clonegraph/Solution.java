package com.leetcode.algorithm.medium.clonegraph;

import com.leetcode.algorithm.common.UndirectedGraphNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    return clone(node, new HashMap<>());
  }

  private UndirectedGraphNode clone(UndirectedGraphNode node, Map<Integer, UndirectedGraphNode> map) {
    if (node == null) {
      return null;
    }

    if (map.containsKey(node.label)) {
      return map.get(node.label);
    }

    UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
    map.put(clone.label, clone);
    for (UndirectedGraphNode neighbor: node.neighbors) {
      clone.neighbors.add(clone(neighbor, map));
    }

    return clone;
  }
}
