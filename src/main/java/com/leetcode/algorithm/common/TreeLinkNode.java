package com.leetcode.algorithm.common;

import java.util.Objects;

public class TreeLinkNode {
  public int val;
  public TreeLinkNode left, right, next;
  public TreeLinkNode(int x) {
    val = x;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof TreeLinkNode)) {
      return false;
    }
    TreeLinkNode treeLinkNode = (TreeLinkNode) o;
    return val == treeLinkNode.val &&
        Objects.equals(left, treeLinkNode.left) &&
        Objects.equals(right, treeLinkNode.right) &&
        Objects.equals(next, treeLinkNode.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(val, left, right, next);
  }
}
