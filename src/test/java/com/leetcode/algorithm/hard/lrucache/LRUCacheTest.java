package com.leetcode.algorithm.hard.lrucache;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LRUCacheTest {
  @Test
  public void testFindMedianSortedArraysCase1() {
    LRUCache cache = new LRUCache(2);
    cache.put(1, 1);
    cache.put(2, 2);
    assertEquals(1, cache.get(1));       // returns 1
    cache.put(3, 3);                              // evicts key 2
    assertEquals(-1, cache.get(2));     // returns -1 (not found)
    cache.put(4, 4);                             // evicts key 1
    assertEquals(-1, cache.get(1));    // returns -1 (not found)
    assertEquals(3, cache.get(3));        // returns 3
    assertEquals(4, cache.get(4));       // returns 4
  }
}
