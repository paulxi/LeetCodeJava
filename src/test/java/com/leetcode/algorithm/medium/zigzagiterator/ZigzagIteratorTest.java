package com.leetcode.algorithm.medium.zigzagiterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ZigzagIteratorTest {
  @Test
  public void testCase1() {
    ZigzagIterator iterator = new ZigzagIterator(Arrays.asList(1, 2), Arrays.asList(3,4,5,6));
    assertEquals(true, iterator.hasNext());
    assertEquals(1, iterator.next());
    assertEquals(true, iterator.hasNext());
    assertEquals(3, iterator.next());
    assertEquals(true, iterator.hasNext());
    assertEquals(2, iterator.next());
    assertEquals(true, iterator.hasNext());
    assertEquals(4, iterator.next());
    assertEquals(true, iterator.hasNext());
    assertEquals(5, iterator.next());
    assertEquals(true, iterator.hasNext());
    assertEquals(6, iterator.next());
    assertEquals(false, iterator.hasNext());
  }
}
