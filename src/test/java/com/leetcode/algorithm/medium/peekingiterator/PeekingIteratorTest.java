package com.leetcode.algorithm.medium.peekingiterator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeekingIteratorTest {
  @Test
  public void testCase1() {
    List<Integer> list = Arrays.asList(1, 2, 3);
    PeekingIterator iterator = new PeekingIterator(list.iterator());
    assertEquals(1, iterator.next().intValue());
    assertEquals(2, iterator.peek().intValue());
    assertEquals(2, iterator.next().intValue());
    assertEquals(3, iterator.next().intValue());
    assertEquals(false, iterator.hasNext());
  }
}
