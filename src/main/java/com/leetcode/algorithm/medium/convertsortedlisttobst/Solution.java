package com.leetcode.algorithm.medium.convertsortedlisttobst;

import com.leetcode.algorithm.common.ListNode;
import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public TreeNode sortedListToBST(ListNode head) {
    if (head == null) {
      return null;
    }

    List<Integer> list = new ArrayList<>();
    while (head != null) {
      list.add(head.val);
      head = head.next;
    }

    return convert(list, 0, list.size() - 1);
  }

  private TreeNode convert(List<Integer> list, int from, int to) {
    if (from > to) {
      return null;
    }

    if (from == to) {
      return new TreeNode(list.get(from));
    }

    int mid = (to + from + 1) / 2 ;
    TreeNode node = new TreeNode(list.get(mid));
    node.left = convert(list, from, mid - 1);
    node.right = convert(list, mid + 1, to);

    return node;
  }
}
