package com.leetcode.algorithm.medium.binarysearchtreeiterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import com.leetcode.algorithm.common.TreeNode;

import org.junit.jupiter.api.Test;

public class BSTIteratorTest {
  @Test
  public void testCase1() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.right = new TreeNode(15);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(7);
    root.right.left = new TreeNode(12);
    root.right.right = new TreeNode(17);
    BSTIterator iterator = new BSTIterator(root);

    ArrayList<Integer> list = new ArrayList<>();
    while (iterator.hasNext()) {
      list.add(iterator.next());
    }

    assertEquals(Arrays.asList(3, 5, 7, 10, 12, 15, 17), list);
  }
}
