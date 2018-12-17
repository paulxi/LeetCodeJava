package com.leetcode.algorithm.easy.twosumiii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTest {
  @Test
  public void testCase1() {
    TwoSum sum = new TwoSum();
    sum.add(1);
    sum.add(3);
    sum.add(5);

    assertEquals(true, sum.find(4));
    assertEquals(false, sum.find(7));
  }

  @Test
  public void testCase2() {
    TwoSum sum = new TwoSum();
    sum.add(3);
    sum.add(2);
    sum.add(1);

    assertEquals(true, sum.find(3));
    assertEquals(false, sum.find(6));
  }
}
