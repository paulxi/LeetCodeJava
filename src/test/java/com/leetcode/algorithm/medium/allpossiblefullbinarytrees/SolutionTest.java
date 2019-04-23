package com.leetcode.algorithm.medium.allpossiblefullbinarytrees;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root1 = new TreeNode(0);
    root1.left = new TreeNode(0);
    root1.right = new TreeNode(0);
    root1.right.left = new TreeNode(0);
    root1.right.right = new TreeNode(0);
    root1.right.right.left = new TreeNode(0);
    root1.right.right.right = new TreeNode(0);

    TreeNode root2 = new TreeNode(0);
    root2.left = new TreeNode(0);
    root2.right = new TreeNode(0);
    root2.right.left = new TreeNode(0);
    root2.right.left.left = new TreeNode(0);
    root2.right.left.right = new TreeNode(0);
    root2.right.right = new TreeNode(0);

    TreeNode root3 = new TreeNode(0);
    root3.left = new TreeNode(0);
    root3.left.left = new TreeNode(0);
    root3.left.right = new TreeNode(0);
    root3.right = new TreeNode(0);
    root3.right.left = new TreeNode(0);
    root3.right.right = new TreeNode(0);

    TreeNode root4 = new TreeNode(0);
    root4.left = new TreeNode(0);
    root4.left.left = new TreeNode(0);
    root4.left.right = new TreeNode(0);
    root4.left.right.left = new TreeNode(0);
    root4.left.right.right = new TreeNode(0);
    root4.right = new TreeNode(0);

    TreeNode root5 = new TreeNode(0);
    root5.left = new TreeNode(0);
    root5.left.left = new TreeNode(0);
    root5.left.left.left = new TreeNode(0);
    root5.left.left.right = new TreeNode(0);
    root5.left.right = new TreeNode(0);
    root5.right = new TreeNode(0);

    assertEquals(Arrays.asList(root1, root2, root3, root4, root5), solution.allPossibleFBT(7));
  }
}
