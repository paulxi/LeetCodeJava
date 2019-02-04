package com.leetcode.algorithm.hard.serializeanddeserializenarytree;

import java.util.*;

class Codec {

  public static class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }

    @Override
    public int hashCode() {
      return Objects.hash(val, children);
    }

    @Override
    public boolean equals(Object obj) {
      if (obj == null) {
        return false;
      }

      if (!(obj instanceof Node)) {
        return false;
      }

      Node node = (Node)obj;
      return val == node.val && children.equals(node.children);
    }
  }

  // Encodes a tree to a single string.
  public String serialize(Node root) {
    List<String> list = new ArrayList<>();
    serializeHelper(root, list);
    return String.join(",", list);
  }

  private void serializeHelper(Node node, List<String> list) {
    if (node == null) {
      return;
    }

    list.add(String.valueOf(node.val));
    list.add(String.valueOf(node.children.size()));

    for (Node child : node.children) {
      serializeHelper(child, list);
    }
  }

  // Decodes your encoded data to tree.
  public Node deserialize(String data) {
    if (data.isEmpty()) {
      return null;
    }

    String[] strs = data.split(",");
    Queue<String> queue = new LinkedList<>(Arrays.asList(strs));
    return deserializeHelper(queue);
  }

  private Node deserializeHelper(Queue<String> queue) {
    Node node = new Node();
    node.val = Integer.valueOf(queue.poll());
    int size = Integer.valueOf(queue.poll());
    node.children = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
      node.children.add(deserializeHelper(queue));
    }
    return node;
  }
}
