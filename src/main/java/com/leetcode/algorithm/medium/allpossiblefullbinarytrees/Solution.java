package com.leetcode.algorithm.medium.allpossiblefullbinarytrees;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  private Map<Integer, List<TreeNode>> memo = new HashMap<>();

  public List<TreeNode> allPossibleFBT(int n) {
    List<TreeNode> res = new ArrayList<>();
    if (n % 2 == 0) {
      return res;
    }

    if (memo.containsKey(n)) {
      return memo.get(n);
    }

    if (n == 1) {
      res.add(new TreeNode(0));
      return res;
    }

    n -= 1;
    for (int i = 1; i < n; i += 2) {
      List<TreeNode> left = allPossibleFBT(i);
      List<TreeNode> right = allPossibleFBT(n - i);
      for (TreeNode nl: left) {
        for (TreeNode nr: right) {
          TreeNode cur = new TreeNode(0);
          cur.left = nl;
          cur.right = nr;
          res.add(cur);
        }
      }
    }

    memo.put(n + 1, res);
    return res;
  }
}
