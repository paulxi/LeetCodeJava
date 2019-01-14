package com.leetcode.algorithm.medium.serializeanddeserializebst;

import com.leetcode.algorithm.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Codec {

  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    if (root == null) {
      return "null";
    }
    StringBuilder sb = new StringBuilder();
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      sb.append(node.val).append(",");
      if (node.right != null) {
        stack.push(node.right);
      }
      if (node.left != null) {
        stack.push(node.left);
      }
    }

    sb.deleteCharAt(sb.length() - 1);
    return sb.toString();
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    if (data.equals("null")) {
      return null;
    }
    String[] strs = data.split(",");
    Queue<Integer> queue = new LinkedList<>();
    for (String s: strs) {
      queue.offer(Integer.valueOf(s));
    }

    return getNode(queue, Integer.MAX_VALUE);
  }

  private TreeNode getNode(Queue<Integer> queue, int uppper) {
    if (queue.isEmpty()) {
      return null;
    }
    if (queue.peek() > uppper) {
      return null;
    }
    TreeNode root = new TreeNode(queue.poll());
    root.left = getNode(queue, root.val);
    root.right = getNode(queue, uppper);

    return root;
  }
}
