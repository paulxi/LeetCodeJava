package com.leetcode.algorithm.medium.braceexpansion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new String[] {"acdf","acef","bcdf","bcef"}, solution.expand("{a,b}c{d,e}f"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new String[] {"abcd"}, solution.expand("abcd"));
  }
}
