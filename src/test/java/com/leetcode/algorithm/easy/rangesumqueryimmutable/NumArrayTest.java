package com.leetcode.algorithm.easy.rangesumqueryimmutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumArrayTest {
  @Test
  public void testCase1() {
    NumArray obj = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
    assertEquals(1, obj.sumRange(0, 2));
    assertEquals(-1, obj.sumRange(2, 5));
    assertEquals(-3, obj.sumRange(0, 5));
  }
}
