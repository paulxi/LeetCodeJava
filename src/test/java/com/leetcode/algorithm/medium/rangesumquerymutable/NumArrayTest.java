package com.leetcode.algorithm.medium.rangesumquerymutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumArrayTest {
  @Test
  public void testCase1() {
    NumArray obj = new NumArray(new int[] {1, 3, 5});
    assertEquals(9, obj.sumRange(0, 2));
    obj.update(1, 2);
    assertEquals(8, obj.sumRange(0, 2));
  }
}
