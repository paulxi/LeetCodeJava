package com.leetcode.algorithm.hard.encodenarytreetobinarytree;

import com.leetcode.algorithm.common.Node;
import com.leetcode.algorithm.common.TreeNode;

import java.util.LinkedList;

class Codec {

  // Encodes an n-ary tree to a binary tree.
  public TreeNode encode(Node root) {
    if (root == null) {
      return null;
    }

    TreeNode res = new TreeNode(root.val);
    if (root.children.size() == 0) {
      return res;
    }

    res.right = encode(root.children.get(0));
    TreeNode cur = res.right;
    for (int i = 1; i < root.children.size(); i++) {
      cur.left = encode(root.children.get(i));
      cur = cur.left;
    }

    return res;
  }

  // Decodes your binary tree to an n-ary tree.
  public Node decode(TreeNode root) {
    if (root == null) {
      return null;
    }

    Node res = new Node(root.val, new LinkedList<>());
    if (root.right == null) {
      return res;
    }

    res.children.add(decode(root.right));
    TreeNode cur = root.right;
    while (cur.left != null) {
      res.children.add(decode(cur.left));
      cur = cur.left;
    }

    return res;
  }
}
