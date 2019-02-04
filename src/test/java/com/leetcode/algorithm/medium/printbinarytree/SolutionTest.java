package com.leetcode.algorithm.medium.printbinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);

    assertEquals(Arrays.asList(
        Arrays.asList("", "1", ""),
        Arrays.asList("2", "", "")
    ), solution.printTree(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(3);

    assertEquals(Arrays.asList(
        Arrays.asList("", "", "", "1", "", "", ""),
        Arrays.asList("", "2", "", "", "", "3", ""),
        Arrays.asList("", "", "4", "", "", "", "")
    ), solution.printTree(root));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.left.left = new TreeNode(4);
    root.right = new TreeNode(5);

    assertEquals(Arrays.asList(
        Arrays.asList("",  "",  "", "",  "", "", "", "1", "",  "",  "",  "",  "", "", ""),
        Arrays.asList("",  "",  "", "2", "", "", "", "",  "",  "",  "",  "5", "", "", ""),
        Arrays.asList("",  "3", "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""),
        Arrays.asList("4", "",  "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", "")
    ), solution.printTree(root));
  }
}
