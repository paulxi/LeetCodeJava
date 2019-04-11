package com.leetcode.algorithm.medium.zigzagiterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagIterator {

//  private Iterator<Integer> i;
//  private Iterator<Integer> j;
//
//  public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
//    j = v1.iterator();
//    i = v2.iterator();
//  }
//
//  public int next() {
//    if (j.hasNext()) {
//      Iterator<Integer> temp = j;
//      j = i;
//      i = temp;
//    }
//
//    return i.next();
//  }
//
//  public boolean hasNext() {
//    return i.hasNext() || j.hasNext();
//  }

  Queue<Iterator> queue;

  public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
    queue = new LinkedList<>();
    if (!v1.isEmpty()) {
      queue.offer(v1.iterator());
    }

    if (!v2.isEmpty()) {
      queue.offer(v2.iterator());
    }
  }

  public int next() {
    Iterator<Integer> iterator = queue.poll();
    int ans = iterator.next();
    if (iterator.hasNext()) {
      queue.offer(iterator);
    }
    return ans;
  }

  public boolean hasNext() {
    return !queue.isEmpty();
  }
}
