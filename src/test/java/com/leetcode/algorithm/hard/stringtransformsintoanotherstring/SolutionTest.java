package com.leetcode.algorithm.hard.stringtransformsintoanotherstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.canConvert("aabcc", "ccdee"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.canConvert("leetcode", "codeleet"));
  }
}
