package com.leetcode.algorithm.easy.constructquadtree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.leetcode.algorithm.easy.constructquadtree.Solution.Node;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    Node root = new Node();
    root.val = false;
    root.isLeaf = false;

    Node topLeft = new Node();
    topLeft.val = true;
    topLeft.isLeaf = true;

    Node topRight = new Node();
    topRight.val = false;
    topRight.isLeaf = false;

    Node bottomLeft = new Node();
    bottomLeft.val = true;
    bottomLeft.isLeaf = true;

    Node bottomRight = new Node();
    bottomRight.val = false;
    bottomRight.isLeaf = true;

    root.topLeft = topLeft;
    root.topRight = topRight;
    root.bottomLeft = bottomLeft;
    root.bottomRight = bottomRight;

    Node topLeft2 = new Node();
    topLeft2.val = false;
    topLeft2.isLeaf = true;

    Node topRight2 = new Node();
    topRight2.val = false;
    topRight2.isLeaf = true;

    Node bottomLeft2 = new Node();
    bottomLeft2.val = true;
    bottomLeft2.isLeaf = true;

    Node bottomRight2 = new Node();
    bottomRight2.val = true;
    bottomRight2.isLeaf = true;

    topRight.topLeft = topLeft2;
    topRight.topRight = topRight2;
    topRight.bottomLeft = bottomLeft2;
    topRight.bottomRight = bottomRight2;

    assertEquals(root, solution.construct(new int[][]{
        {1, 1, 1, 1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0, 0, 0, 0}
    }));
  }
}
