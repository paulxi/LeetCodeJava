package com.leetcode.algorithm.medium.populatingnextrightpointersineachnodeii;

import com.leetcode.algorithm.common.TreeLinkNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
//  public void connect(TreeLinkNode root) {
//    if (root == null) {
//      return;
//    }
//
//    List<TreeLinkNode> list = new ArrayList<>();
//    list.add(root);
//    while (!list.isEmpty()) {
//      List<TreeLinkNode> temp = new ArrayList<>();
//
//      for (int i = 0; i < list.size(); i++) {
//        if (i + 1 < list.size()) {
//          list.get(i).next = list.get(i + 1);
//        }
//
//        if (list.get(i).left != null) {
//          temp.add(list.get(i).left);
//        }
//        if (list.get(i).right != null) {
//          temp.add(list.get(i).right);
//        }
//      }
//
//      list = temp;
//    }
//  }

  public void connect(TreeLinkNode root) {
    TreeLinkNode dummy = new TreeLinkNode(0);
    TreeLinkNode prev = dummy;
    TreeLinkNode curr = root;
    while (curr != null) {
      if (curr.left != null) {
        prev.next = curr.left;
        prev = prev.next;
      }
      if (curr.right != null) {
        prev.next = curr.right;
        prev = prev.next;
      }
      curr = curr.next;
      if (curr == null) {
        prev = dummy;
        curr = dummy.next;
        dummy.next = null;
      }
    }
  }
}
