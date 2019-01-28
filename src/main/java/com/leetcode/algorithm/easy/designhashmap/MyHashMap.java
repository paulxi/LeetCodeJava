package com.leetcode.algorithm.easy.designhashmap;

class MyHashMap {

  private static class ListNode {
    int key, val;
    ListNode next;

    ListNode(int key, int val) {
      this.key = key;
      this.val = val;
    }
  }

  final ListNode[] nodes = new ListNode[10000];

  /** Initialize your data structure here. */
  public MyHashMap() {

  }

  /** value will always be non-negative. */
  public void put(int key, int value) {
    int i = idx(key);
    if (nodes[i] == null) {
      nodes[i] = new ListNode(-1, -1);
    }

    ListNode prev = find(nodes[i], key);
    if (prev.next == null) {
      prev.next = new ListNode(key, value);
    } else {
      prev.next.val = value;
    }
  }

  /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
  public int get(int key) {
    int i = idx(key);
    if (nodes[i] == null) {
      return -1;
    }
    ListNode prev = find(nodes[i], key);
    if (prev.next == null) {
      return -1;
    } else {
      return prev.next.val;
    }
  }

  /** Removes the mapping of the specified value key if this map contains a mapping for the key */
  public void remove(int key) {
    int i = idx(key);
    if (nodes[i] == null) {
      return;
    }
    ListNode prev = find(nodes[i], key);
    if (prev.next != null) {
      prev.next = prev.next.next;
    }
  }

  private int idx(int key) {
    return Integer.hashCode(key) % nodes.length;
  }

  private ListNode find(ListNode node, int key) {
    ListNode prev = null;
    while (node != null && node.key != key) {
      prev = node;
      node = node.next;
    }
    return prev;
  }
}
