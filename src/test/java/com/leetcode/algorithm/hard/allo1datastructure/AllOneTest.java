package com.leetcode.algorithm.hard.allo1datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AllOneTest {
  @Test
  public void testCase1() {
    AllOne obj = new AllOne();
    obj.inc("a");
    obj.inc("a");
    obj.inc("a");
    obj.dec("a");
    obj.inc("b");

    assertEquals("a", obj.getMaxKey());
    assertEquals("b", obj.getMinKey());
  }
}
