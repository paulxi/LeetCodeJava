package com.leetcode.algorithm.hard.allo1datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class AllOne {
  private static class DLinkNode {
    int count;
    Set<String> keySet;
    DLinkNode next;
    DLinkNode pre;
    public DLinkNode(int cnt) {
      count = cnt;
      keySet = new HashSet<>();
    }
  }

  private DLinkNode head;
  private DLinkNode tail;
  private Map<Integer, DLinkNode> countMap;
  private Map<String, Integer> keyMap;

  /** Initialize your data structure here. */
  public AllOne() {
    head = new DLinkNode(Integer.MIN_VALUE);
    tail = new DLinkNode(Integer.MAX_VALUE);
    head.next = tail;
    tail.pre = head;
    countMap = new HashMap<>();
    keyMap = new HashMap<>();
  }

  /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
  public void inc(String key) {
    if (keyMap.containsKey(key)) {
      changeKey(key, 1);
    } else {
      keyMap.put(key, 1);
      if (head.next.count != 1) {
        addNodeAfter(new DLinkNode(1), head);
      }
      head.next.keySet.add(key);
      countMap.put(1, head.next);
    }
  }

  /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
  public void dec(String key) {
    if (keyMap.containsKey(key)) {
      int count = keyMap.get(key);
      if (count == 1) {
        keyMap.remove(key);
        removeKeyFromNode(countMap.get(count), key);
      } else {
        changeKey(key, -1);
      }
    }
  }

  /** Returns one of the keys with maximal value. */
  public String getMaxKey() {
    return tail.pre == head ? "" : tail.pre.keySet.iterator().next();
  }

  /** Returns one of the keys with Minimal value. */
  public String getMinKey() {
    return head.next == tail ? "" : head.next.keySet.iterator().next();
  }

  private void changeKey(String key, int offset) {
    int count = keyMap.get(key);
    keyMap.put(key, count + offset);
    DLinkNode curNode = countMap.get(count);
    DLinkNode newNode;
    if (countMap.containsKey(count + offset)) {
      newNode = countMap.get(count + offset);
    } else {
      newNode = new DLinkNode(count + offset);
      countMap.put(count + offset, newNode);
      addNodeAfter(newNode, offset == 1 ? curNode : curNode.pre);
    }

    newNode.keySet.add(key);
    removeKeyFromNode(curNode, key);
  }

  private void removeKeyFromNode(DLinkNode node, String key) {
    node.keySet.remove(key);
    if (node.keySet.isEmpty()) {
      removeNodeFromList(node);
      countMap.remove(node.count);
    }
  }

  private void removeNodeFromList(DLinkNode node) {
    node.pre.next = node.next;
    node.next.pre = node.pre;
    node.pre = null;
    node.next = null;
  }

  private void addNodeAfter(DLinkNode newNode, DLinkNode preNode) {
    newNode.pre = preNode;
    newNode.next = preNode.next;
    preNode.next.pre = newNode;
    preNode.next = newNode;
  }
}
