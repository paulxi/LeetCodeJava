package com.leetcode.algorithm.easy.similarrgbcolor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("#11ee66", solution.similarRGB("#09f166"));
  }
}
