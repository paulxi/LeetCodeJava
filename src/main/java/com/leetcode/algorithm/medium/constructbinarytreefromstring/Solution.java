package com.leetcode.algorithm.medium.constructbinarytreefromstring;

import com.leetcode.algorithm.common.TreeNode;

class Solution {
  public TreeNode str2tree(String s) {
    if (s.length() == 0) {
      return null;
    }

    int index = s.indexOf('(');
    if (index == -1) {
      return new TreeNode(Integer.valueOf(s));
    }

    TreeNode node = new TreeNode(Integer.valueOf(s.substring(0, index)));

    StringBuilder sb = new StringBuilder();
    int count = 0;
    while (index < s.length()) {
      sb.append(s.charAt(index));

      if (s.charAt(index) == '(') {
        count++;
      } else if (s.charAt(index) == ')') {
        count--;
      }

      if (count == 0) {
        break;
      }
      index++;
    }

    node.left = str2tree(sb.substring(1, sb.length() - 1));

    if (index + 2 < s.length()) {
      node.right = str2tree(s.substring(index + 2, s.length() - 1));
    }

    return node;
  }
}
