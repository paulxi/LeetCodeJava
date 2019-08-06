package com.leetcode.algorithm.easy.reversebits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(964176192, solution.reverseBits(43261596));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(964176192, solution.reverseBits2(43261596));
  }
}
