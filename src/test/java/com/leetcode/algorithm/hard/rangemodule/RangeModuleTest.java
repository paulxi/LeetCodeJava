package com.leetcode.algorithm.hard.rangemodule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeModuleTest {
  @Test
  public void testCase1() {
    RangeModule obj = new RangeModule();
    obj.addRange(10 ,20);
    obj.removeRange(14, 16);
    assertEquals(true, obj.queryRange(10, 14));
    assertEquals(false, obj.queryRange(13, 15));
    assertEquals(true, obj.queryRange(16, 17));
  }
}
