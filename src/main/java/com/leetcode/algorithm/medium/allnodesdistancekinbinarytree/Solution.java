package com.leetcode.algorithm.medium.allnodesdistancekinbinarytree;

import com.leetcode.algorithm.common.TreeNode;

import java.util.*;

class Solution {
  public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    List<Integer> ans = new ArrayList<>();
    if (k == 0) {
      ans.add(target.val);
      return ans;
    }
    Map<TreeNode, Set<TreeNode>> map = new HashMap<>();
    preorder(null, root, map);

    Set<TreeNode> visited = new HashSet<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(target);
    visited.add(target);

    while (!queue.isEmpty() && k > 0) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        Set<TreeNode> nei = map.get(node);
        if (nei != null) {
          for (TreeNode next: nei) {
            if (visited.contains(next)) {
              continue;
            }

            queue.offer(next);
            visited.add(next);
          }
        }
      }

      k--;
      if (k == 0) {
        while (!queue.isEmpty()) {
          ans.add(queue.poll().val);
        }
      }
    }

    return ans;
  }

  private void preorder(TreeNode parent, TreeNode child, Map<TreeNode, Set<TreeNode>> map) {
    if (child == null) {
      return;
    }

    if (parent != null && child != null) {
      if (!map.containsKey(parent)) {
        map.put(parent, new HashSet<>());
      }
      map.get(parent).add(child);

      if (!map.containsKey(child)) {
        map.put(child, new HashSet<>());
      }
      map.get(child).add(parent);
    }

    preorder(child, child.left, map);
    preorder(child, child.right, map);
  }
}
