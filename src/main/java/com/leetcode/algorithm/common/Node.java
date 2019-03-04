package com.leetcode.algorithm.common;

import java.util.List;
import java.util.Objects;

public class Node {
  public int val;
  public List<Node> children;

  public Node() {}

  public Node(int val, List<Node> children) {
    this.val = val;
    this.children = children;
  }

  @Override
  public int hashCode() {
    return Objects.hash(val, children);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (!(obj instanceof Node)) {
      return false;
    }

    Node node = (Node)obj;
    return val == node.val && children.equals(node.children);
  }
}
