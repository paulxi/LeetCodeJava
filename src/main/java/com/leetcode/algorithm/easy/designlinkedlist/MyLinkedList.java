package com.leetcode.algorithm.easy.designlinkedlist;

public class MyLinkedList {

  private static class Node {
    Node next;
    int val;

    Node(int val) {
      this.val = val;
    }
  }

  Node head;
  Node tail;
  int size;

  /** Initialize your data structure here. */
  public MyLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
  public int get(int index) {
    if (index >= size) {
      return -1;
    }

    Node temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }

    return temp.val;
  }

  /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
  public void addAtHead(int val) {
    Node temp = new Node(val);
    temp.next = head;
    head = temp;

    if (tail == null) {
      tail = temp;
    }
    size++;
  }

  /** Append a node of value val to the last element of the linked list. */
  public void addAtTail(int val) {
    Node temp = new Node(val);
    if (tail != null) {
      tail.next = temp;
    } else {
      head = temp;
    }

    tail = temp;
    size++;
  }

  /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
  public void addAtIndex(int index, int val) {
    if (index > size) {
      return;
    }

    if (index == size) {
      addAtTail(val);
      return;
    }

    if (index == 0) {
      addAtHead(val);
      return;
    }

    Node node = head;
    for (int i = 0; i < index - 1; i++) {
      node = node.next;
    }

    Node temp = new Node(val);
    Node next = node.next;

    node.next = temp;
    temp.next = next;
    size++;
  }

  /** Delete the index-th node in the linked list, if the index is valid. */
  public void deleteAtIndex(int index) {
    if (index >= size) {
      return;
    }

    if (index == 0) {
      head = head.next;
      if (head == null)
      size--;
      return;
    }

    Node node = head;
    for (int i = 0; i < index - 1; i++) {
      node = node.next;
    }

    if (index == size - 1) {
      tail = node;
      tail.next = null;
    } else {
      Node next = node.next;
      node.next = next.next;
    }
    size--;
    return;
  }
}
