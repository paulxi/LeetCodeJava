package com.leetcode.algorithm.medium.inordersuccessorinbstii;

import org.junit.jupiter.api.Test;

import static com.leetcode.algorithm.medium.inordersuccessorinbstii.Solution.Node;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    Node root = new Node(2);
    root.left = new Node(1);
    root.left.parent = root;
    root.right = new Node(3);
    root.right.parent = root;

    assertEquals(root, solution.inorderSuccessor(root.left));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    Node root = new Node(5);
    root.left = new Node(3);
    root.left.parent = root;
    root.left.left = new Node(2);
    root.left.left.parent = root.left;
    root.left.right = new Node(4);
    root.left.right.parent = root.left;
    root.left.left.left = new Node(1);
    root.left.left.left.parent = root.left.left;
    root.right = new Node(6);
    root.right.parent = root;

    assertNull(solution.inorderSuccessor(root.right));
  }
}
