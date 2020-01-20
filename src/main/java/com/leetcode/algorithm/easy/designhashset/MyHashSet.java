package com.leetcode.algorithm.easy.designhashset;

class MyHashSet {
    private static class ListNode {
        int key;
        ListNode next;

        ListNode(int key) {
            this.key = key;
        }
    }

    final ListNode[] nodes = new ListNode[10000];

    /** Initialize your data structure here. */
    public MyHashSet() {

    }

    public void add(int key) {
        int i = idx(key);
        if (nodes[i] == null) {
            nodes[i] = new ListNode(-1);
        }

        ListNode prev = find(nodes[i], key);
        if (prev.next == null) {
            prev.next = new ListNode(key);
        }
    }

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

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int i = idx(key);
        if (nodes[i] == null) {
            return false;
        }
        ListNode prev = find(nodes[i], key);
        return prev.next != null;
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
