package com.leetcode.algorithm.medium.allnodesdistancekinbinarytree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    List<Integer> ans = new ArrayList<>();
    dfs(root, target, k, ans);
    return ans;
  }

  private int dfs(TreeNode node, TreeNode target, int k, List<Integer> ans) {
    if (node == null) {
      return -1;
    }

    if (node == target) {
      subtree_add(node, 0, k, ans);
      return 1;
    } else {
      int l = dfs(node.left, target, k, ans);
      int r = dfs(node.right, target, k, ans);
      if (l != -1) {
        if (l == k) {
          ans.add(node.val);
        } else if (l < k) {
          subtree_add(node.right, l + 1, k, ans);
        }
        return l + 1;
      } else if (r != -1) {
        if (r == k) {
          ans.add(node.val);
        } else if (r < k) {
          subtree_add(node.left, r + 1, k, ans);
        }
        return r + 1;
      } else {
        return -1;
      }
    }
  }

  private void subtree_add(TreeNode node, int dist, int k, List<Integer> ans) {
    if (node == null) {
      return;
    }
    if (dist == k) {
      ans.add(node.val);
    } else {
      subtree_add(node.left, dist + 1, k, ans);
      subtree_add(node.right, dist + 1, k, ans);
    }
  }
}
