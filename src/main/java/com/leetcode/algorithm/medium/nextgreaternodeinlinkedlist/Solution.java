package com.leetcode.algorithm.medium.nextgreaternodeinlinkedlist;

import com.leetcode.algorithm.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
  public int[] nextLargerNodes(ListNode head) {
    List<Integer> list = new ArrayList<>();
    while (head != null) {
      list.add(head.val);
      head = head.next;
    }

    int[] res = new int[list.size()];
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < res.length; i++) {
      while (!stack.isEmpty() && list.get(stack.peek()) < list.get(i)) {
        res[stack.pop()] = list.get(i);
      }

      stack.push(i);
    }

    return res;
  }
}
