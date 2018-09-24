package com.leetcode.algorithm.hard.lrucache;

import java.util.HashMap;

class LRUCache {

  private static class DLinkedNode {
    public int key;
    public int value;
    DLinkedNode pre;
    DLinkedNode post;
  }

  private int capacity;
  private HashMap<Integer, DLinkedNode> cache;
  private int count;
  private DLinkedNode header;
  private DLinkedNode tail;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    this.cache = new HashMap<>();
    this.count = 0;

    this.header = new DLinkedNode();
    this.tail = new DLinkedNode();
    this.header.post = this.tail;
    this.tail.pre = this.header;
  }

  public int get(int key) {
    DLinkedNode node = cache.get(key);
    if (node == null) {
      return -1;
    } else {
      this.removeNode(node);
      this.addNode(node);
      return node.value;
    }
  }

  public void put(int key, int value) {
    DLinkedNode node = cache.get(key);
    if (node == null) {
      if (this.count == this.capacity) {
        this.cache.remove(this.tail.pre.key);
        this.removeNode(this.tail.pre);
        this.count -= 1;
      }

      node = new DLinkedNode();
      node.key = key;
      node.value = value;
      this.addNode(node);
      this.cache.put(key, node);
      this.count += 1;
    } else {
      node.value = value;
      this.removeNode(node);
      this.addNode(node);
    }
  }

  private void addNode(DLinkedNode node) {
    header.post.pre = node;
    node.post = header.post;
    header.post = node;
    node.pre = header;
  }

  private void removeNode(DLinkedNode node) {
    node.pre.post = node.post;
    node.post.pre = node.pre;
  }
}
