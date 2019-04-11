package com.leetcode.algorithm.medium.rleiterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RLEIteratorTest {
  @Test
  public void testCase1() {
    RLEIterator iterator = new RLEIterator(new int[] {3,8,0,9,2,5});
    assertEquals(8, iterator.next(2));
    assertEquals(8, iterator.next(1));
    assertEquals(5, iterator.next(1));
    assertEquals(-1, iterator.next(2));
  }
}
