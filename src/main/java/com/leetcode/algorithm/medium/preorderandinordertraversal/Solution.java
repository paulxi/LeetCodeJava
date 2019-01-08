package com.leetcode.algorithm.medium.preorderandinordertraversal;

import com.leetcode.algorithm.common.TreeNode;

import java.util.HashMap;

class Solution {
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < inorder.length; i++) {
      map.put(inorder[i], i);
    }

    return buildTreeNode(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
  }


  private TreeNode buildTreeNode(int[] preorder, int ps, int pe, int[] inorder, int is, int ie, HashMap<Integer, Integer> map) {
    if (pe < ps || ie < is) {
      return null;
    }

    int index = map.get(preorder[ps]);

    TreeNode node = new TreeNode(preorder[ps]);
    TreeNode left = buildTreeNode(preorder, ps + 1, ps + index - is, inorder, is, index - 1, map);
    TreeNode right = buildTreeNode(preorder, pe -(ie - index - 1),pe, inorder, index + 1, ie, map);

    node.left = left;
    node.right = right;
    return node;
  }
}
