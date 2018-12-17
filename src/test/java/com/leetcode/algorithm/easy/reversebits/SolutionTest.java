package com.leetcode.algorithm.easy.reversebits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testPositiveNumber() {
    Solution solution = new Solution();
    assertEquals(964176192, solution.reverseBits(43261596));
  }
}
