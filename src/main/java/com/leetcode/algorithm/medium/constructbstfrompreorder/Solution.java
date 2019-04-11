package com.leetcode.algorithm.medium.constructbstfrompreorder;

import com.leetcode.algorithm.common.TreeNode;

import java.util.Stack;

class Solution {
//  public TreeNode bstFromPreorder(int[] preorder) {
//    Stack<TreeNode> stack = new Stack<>();
//    if (preorder.length == 0) {
//      return null;
//    }
//
//    TreeNode root = new TreeNode(preorder[0]);
//    stack.push(root);
//    for (int i = 1; i < preorder.length; i++) {
//      TreeNode node = new TreeNode(preorder[i]);
//
//      if (!stack.isEmpty()) {
//        if (node.val < stack.peek().val) {
//          stack.peek().left = node;
//        } else {
//          TreeNode popped = null;
//          while (!stack.isEmpty() && node.val > stack.peek().val) {
//            popped = stack.pop();
//          }
//
//          if (popped != null) {
//            popped.right = node;
//          }
//        }
//      }
//
//      stack.push(node);
//
//    }
//
//    return root;
//  }

  int index = 0;
  public TreeNode bstFromPreorder(int[] preorder) {
    return bstFromPreorder(preorder, Integer.MAX_VALUE);
  }

  private TreeNode bstFromPreorder(int[] preorder, int bound) {
    if (index == preorder.length || preorder[index] > bound) {
      return null;
    }

    TreeNode node = new TreeNode(preorder[index]);
    index++;
    node.left = bstFromPreorder(preorder, node.val);
    node.right = bstFromPreorder(preorder, bound);
    return node;
  }
}
