package com.leetcode.algorithm.easy.constructquadtree;

import java.util.Objects;

class Solution {
  static class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
      val = _val;
      isLeaf = _isLeaf;
      topLeft = _topLeft;
      topRight = _topRight;
      bottomLeft = _bottomLeft;
      bottomRight = _bottomRight;
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
          isLeaf == node.isLeaf &&
          Objects.equals(topLeft, node.topLeft) &&
          Objects.equals(topRight, node.topRight) &&
          Objects.equals(bottomLeft, node.bottomLeft) &&
          Objects.equals(bottomRight, node.bottomRight);
    }

    @Override
    public int hashCode() {
      return Objects.hash(val, isLeaf, topLeft, topRight, bottomLeft, bottomRight);
    }
  }

  public Node construct(int[][] grid) {
    return helper(grid, 0, 0, grid.length);
  }

  private Node helper(int[][] grid, int x, int y, int len) {
    if (len == 1) {
      return new Node(grid[x][y] != 0, true, null, null, null, null);
    }

    Node result = new Node();
    Node topLeft = helper(grid, x, y, len / 2);
    Node topRight = helper(grid, x, y + len / 2, len / 2);
    Node bottomLeft = helper(grid, x + len / 2, y, len / 2);
    Node bottomRight = helper(grid, x + len / 2, y + len / 2, len / 2);

    if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf &&
      topLeft.val == topRight.val && topLeft.val == bottomLeft.val && topLeft.val == bottomRight.val) {
      result.val = topLeft.val;
      result.isLeaf = true;
    } else {
      result.topLeft = topLeft;
      result.topRight = topRight;
      result.bottomLeft = bottomLeft;
      result.bottomRight = bottomRight;
    }

    return result;
  }
}
