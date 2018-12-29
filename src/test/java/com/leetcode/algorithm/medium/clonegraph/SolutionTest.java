package com.leetcode.algorithm.medium.clonegraph;

import com.leetcode.algorithm.common.UndirectedGraphNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    UndirectedGraphNode node0 = new UndirectedGraphNode(0);
    UndirectedGraphNode node1 = new UndirectedGraphNode(1);
    UndirectedGraphNode node2 = new UndirectedGraphNode(2);

    node0.neighbors.add(node1);
    node0.neighbors.add(node2);
    node1.neighbors.add(node0);
    node1.neighbors.add(node2);
    node2.neighbors.add(node0);
    node2.neighbors.add(node1);
    node2.neighbors.add(node2);

    assertEquals(node0, solution.cloneGraph(node0));
  }
}
