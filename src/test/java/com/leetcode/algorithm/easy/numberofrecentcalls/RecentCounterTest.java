package com.leetcode.algorithm.easy.numberofrecentcalls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecentCounterTest {
  @Test
  public void testCase1() {
    RecentCounter counter = new RecentCounter();
    assertEquals(1, counter.ping(1));
    assertEquals(2, counter.ping(100));
    assertEquals(3, counter.ping(3001));
    assertEquals(3, counter.ping(3002));
  }
}
