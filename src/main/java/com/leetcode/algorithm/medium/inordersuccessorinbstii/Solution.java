package com.leetcode.algorithm.medium.inordersuccessorinbstii;

import java.util.Objects;

class Solution {
  final static class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;

    public Node(int val) {
      this.val = val;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Node)) {
        return false;
      }
      Node node = (Node) o;
      return val == node.val &&
          Objects.equals(left, node.left) &&
          Objects.equals(right, node.right);
    }

    @Override
    public int hashCode() {
      return Objects.hash(val, left, right);
    }
  }

  public Node inorderSuccessor(Node x) {
    if (x.right == null) {
      Node result = x.parent;
      while (result != null && result.val < x.val) {
        result = result.parent;
      }
      return result;
    } else {
      Node result = x.right;
      while (result.left != null) {
        result = result.left;
      }

      return result;
    }
  }
}
