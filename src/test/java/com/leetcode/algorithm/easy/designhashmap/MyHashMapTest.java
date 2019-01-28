package com.leetcode.algorithm.easy.designhashmap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyHashMapTest {
  @Test
  public void testCase1() {
    MyHashMap hashMap = new MyHashMap();
    hashMap.put(1, 1);
    hashMap.put(2, 2);
    assertEquals(1, hashMap.get(1));            // returns 1
    assertEquals(-1, hashMap.get(3));            // returns -1 (not found)
    hashMap.put(2, 1);          // update the existing value
    hashMap.get(2);            // returns 1
    hashMap.remove(2);          // remove the mapping for 2
    assertEquals(-1, hashMap.get(2));            // returns -1 (not found)
  }
}
