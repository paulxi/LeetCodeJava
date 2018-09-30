package com.leetcode.algorithm.medium.copylistwithrandompointer;

import com.leetcode.algorithm.common.RandomListNode;

import java.util.HashMap;

class Solution {
  public RandomListNode copyRandomList(RandomListNode head) {
    if (head == null) {
      return null;
    }

    HashMap<RandomListNode, RandomListNode> visitedNodes = new HashMap<>();
    RandomListNode oldNode = head;
    RandomListNode newNode = new RandomListNode(head.label);
    visitedNodes.put(head, newNode);

    while (oldNode != null) {
      newNode.random = getClonedNode(visitedNodes, oldNode.random);
      newNode.next = getClonedNode(visitedNodes, oldNode.next);

      oldNode = oldNode.next;
      newNode = newNode.next;
    }

    return visitedNodes.get(head);
  }

  private RandomListNode getClonedNode(HashMap<RandomListNode, RandomListNode> visitedNodes,
                                       RandomListNode node) {
    if (node == null) {
      return null;
    }
    RandomListNode clonedNode =  visitedNodes.getOrDefault(node, new RandomListNode(node.label));
    visitedNodes.put(node, clonedNode);
    return clonedNode;
  }
}
