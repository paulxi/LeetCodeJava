package com.leetcode.algorithm.easy.buddystrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.buddyStrings("ab", "ba"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.buddyStrings("ab", "ab"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(true, solution.buddyStrings("aa", "aa"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(true, solution.buddyStrings("aaaaaaabc", "aaaaaaacb"));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertEquals(false, solution.buddyStrings("", "aa"));
  }
}
