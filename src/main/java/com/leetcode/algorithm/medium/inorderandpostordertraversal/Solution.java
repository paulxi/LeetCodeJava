package com.leetcode.algorithm.medium.inorderandpostordertraversal;

import com.leetcode.algorithm.common.TreeNode;

import java.util.HashMap;

class Solution {
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    if (postorder.length == 0) {
      return null;
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < inorder.length; i++) {
      map.put(inorder[i], i);
    }

    return buildTreePostIn(inorder, 0, inorder.length - 1, postorder, 0,
        postorder.length - 1, map);
  }

  private TreeNode buildTreePostIn(int[] inorder, int is, int ie, int[] postorder, int ps, int pe,
                                   HashMap<Integer, Integer> map) {
    if (ps > pe || is > ie) {
      return null;
    }

    TreeNode node = new TreeNode(postorder[pe]);
    int index = map.get(postorder[pe]);
    TreeNode leftChild = buildTreePostIn(inorder, is, index - 1, postorder, ps, ps + index - is - 1, map);
    TreeNode rightChild = buildTreePostIn(inorder, index + 1, ie, postorder,ps + index - is, pe - 1, map);

    node.left = leftChild;
    node.right = rightChild;

    return node;
  }
}
