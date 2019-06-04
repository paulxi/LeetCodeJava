package com.leetcode.algorithm.medium.shortestwaytoformstring;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.shortestWay("abc", "abcbc"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-1, solution.shortestWay("abc", "acdbc"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(3, solution.shortestWay("xyz", "xzyxz"));
  }
}
