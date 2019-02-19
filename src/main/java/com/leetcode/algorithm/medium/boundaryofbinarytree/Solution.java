package com.leetcode.algorithm.medium.boundaryofbinarytree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

class Solution {
  public List<Integer> boundaryOfBinaryTree(TreeNode root) {
    List<Integer> leftBoundary = new LinkedList<>();
    List<Integer> rightBoundary = new LinkedList<>();
    List<Integer> leaves = new LinkedList<>();
    preorder(root, leftBoundary, rightBoundary, leaves, 0);

    leftBoundary.addAll(leaves);
    leftBoundary.addAll(rightBoundary);
    return leftBoundary;
  }

  private void preorder(TreeNode cur, List<Integer> leftBoundary,
                        List<Integer> rightBoundary, List<Integer> leaves, int flag) {
    if (cur == null) {
      return;
    }
    if (isRightBoundary(flag)) {
      rightBoundary.add(0, cur.val);
    } else if (isLeftBoundary(flag) || isRoot(flag)) {
      leftBoundary.add(cur.val);
    } else if (isLeaf(cur)) {
      leaves.add(cur.val);
    }
    preorder(cur.left, leftBoundary, rightBoundary, leaves, leftChildFlag(cur, flag));
    preorder(cur.right, leftBoundary, rightBoundary, leaves, rightChildFlag(cur, flag));
  }

  private boolean isLeaf(TreeNode cur) {
    return cur.left == null && cur.right == null;
  }

  private boolean isRightBoundary(int flag) {
    return flag == 2;
  }

  private boolean isLeftBoundary(int flag) {
    return flag == 1;
  }

  private boolean isRoot(int flag) {
    return flag == 0;
  }

  private int leftChildFlag(TreeNode cur, int flag) {
    if (isLeftBoundary(flag) || isRoot(flag)) {
      return 1;
    } else if (isRightBoundary(flag) && cur.right == null) {
      return 2;
    } else {
      return 3;
    }
  }

  private int rightChildFlag(TreeNode cur, int flag) {
    if (isRightBoundary(flag) || isRoot(flag)) {
      return 2;
    } else if (isLeftBoundary(flag) && cur.left == null) {
      return 1;
    } else {
      return 3;
    }
  }
}

