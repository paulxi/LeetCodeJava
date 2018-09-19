package com.leetcode.algorithm.hard.regularexpressionmatching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testMatchingCase1() {
    Solution solution = new Solution();

    assertEquals(false, solution.isMatch("aa", "a"));
  }

  @Test
  public void testMatchingCase2() {
    Solution solution = new Solution();

    assertEquals(true, solution.isMatch("aa", "a*"));
  }

  @Test
  public void testMatchingCase3() {
    Solution solution = new Solution();

    assertEquals(true, solution.isMatch("ab", ".*"));
  }

  @Test
  public void testMatchingCase4() {
    Solution solution = new Solution();

    assertEquals(true, solution.isMatch("aab", "c*a*b"));
  }

  @Test
  public void testMatchingCase5() {
    Solution solution = new Solution();

    assertEquals(false, solution.isMatch("mississippi", "mis*is*p*."));
  }

  @Test
  public void testMatchingCase6() {
    Solution solution = new Solution();

    assertEquals(true, solution.isMatch("aaa", "a*"));
  }
}
