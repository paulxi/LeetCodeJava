package com.leetcode.algorithm.hard.stickerstospellword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.minStickers(new String[] {"with", "example", "science"}, "thehat"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-1, solution.minStickers(new String[] {"notice", "possible"}, "basicbasic"));
  }
}
