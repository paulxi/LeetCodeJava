package com.leetcode.algorithm.medium.uniquebinarysearchtreesii;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    TreeNode root1 = new TreeNode(1);
    root1.right = new TreeNode(3);
    root1.right.left =  new TreeNode(2);

    TreeNode root2 = new TreeNode(3);
    root2.left = new TreeNode(2);
    root2.left.left =  new TreeNode(1);

    TreeNode root3 = new TreeNode(3);
    root3.left = new TreeNode(1);
    root3.left.right =  new TreeNode(2);

    TreeNode root4 = new TreeNode(2);
    root4.left = new TreeNode(1);
    root4.right = new TreeNode(3);

    TreeNode root5 = new TreeNode(1);
    root5.right = new TreeNode(2);
    root5.right.right = new TreeNode(3);

    List<TreeNode> expected = Arrays.asList(root5, root1, root4, root3, root2);

    assertEquals(expected, solution.generateTrees(3));
  }
}
