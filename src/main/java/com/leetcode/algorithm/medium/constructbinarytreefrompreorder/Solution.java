package com.leetcode.algorithm.medium.constructbinarytreefrompreorder;

import com.leetcode.algorithm.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public TreeNode constructFromPrePost(int[] pre, int[] post) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < post.length; i++) {
      map.put(post[i], i);
    }

    return dfs(pre, 0, pre.length - 1, post, 0, post.length - 1, map);
  }

  private TreeNode dfs(
      int[] pre,
      int preStart,
      int preEnd,
      int[] post,
      int postStart,
      int postEnd,
      Map<Integer, Integer> map) {
    if (preStart > preEnd || postStart > postEnd) {
      return null;
    }

    TreeNode node = new TreeNode(pre[preStart]);
    if (preStart + 1 <= preEnd) {
      int deltaIndex = map.get(pre[preStart + 1]) - postStart;
      node.left =
          dfs(
              pre,
              preStart + 1,
              preStart + 1 + deltaIndex,
              post,
              postStart,
              postStart + deltaIndex,
              map);
      node.right =
          dfs(
              pre,
              preStart + 1 + deltaIndex + 1,
              preEnd,
              post,
              postStart + deltaIndex + 1,
              postEnd - 1,
              map);
    }
    return node;
  }
}
