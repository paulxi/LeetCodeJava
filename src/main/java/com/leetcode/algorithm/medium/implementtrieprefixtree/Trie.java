package com.leetcode.algorithm.medium.implementtrieprefixtree;

import java.util.*;

class Trie {
  private static class Node {
    char c;
    boolean isEnd;
    Map<Character, Node> subNodes;

    Node(char c, boolean isEnd) {
      this.c = c;
      this.isEnd = isEnd;
      this.subNodes = new HashMap<>();
    }

    void addNode(Node node) {
      this.subNodes.put(node.c, node);
    }

    Node findNode(char c) {
      return subNodes.get(c);
    }
  }

  Node root;

  /** Initialize your data structure here. */
  public Trie() {
    root = new Node(' ', false);
  }

  /** Inserts a word into the trie. */
  public void insert(String word) {
    Node parent = root;
    for (char c : word.toCharArray() ) {
      Node node = parent.findNode(c);
      if (node == null) {
        node = new Node(c, false);
        parent.addNode(node);
      }
      parent = node;
    }

    parent.isEnd = true;
  }

  /** Returns if the word is in the trie. */
  public boolean search(String word) {
    Node parent = root;
    for (char c: word.toCharArray()) {
      Node node = parent.findNode(c);
      if (node == null) {
        return false;
      }
      parent = node;
    }
    return parent.isEnd;
  }

  /** Returns if there is any word in the trie that starts with the given prefix. */
  public boolean startsWith(String prefix) {
    Node parent = root;
    for (char c: prefix.toCharArray()) {
      Node node = parent.findNode(c);
      if (node == null) {
        return false;
      }
      parent = node;
    }
    return true;
  }
}
