package com.leetcode.algorithm.hard.wildcardmatching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testMatchingCase1() {
    Solution solution = new Solution();

    assertEquals(false, solution.isMatch("aa", "a"));
  }

  @Test
  public void testMatchingCase2() {
    Solution solution = new Solution();

    assertEquals(true, solution.isMatch("aa", "*"));
  }

  @Test
  public void testMatchingCase3() {
    Solution solution = new Solution();

    assertEquals(false, solution.isMatch("cb", "?a"));
  }

  @Test
  public void testMatchingCase4() {
    Solution solution = new Solution();

    assertEquals(true, solution.isMatch("adceb", "*a*b"));
  }

  @Test
  public void testMatchingCase5() {
    Solution solution = new Solution();

    assertEquals(false, solution.isMatch("acdcb", "a*c?b"));
  }
}
