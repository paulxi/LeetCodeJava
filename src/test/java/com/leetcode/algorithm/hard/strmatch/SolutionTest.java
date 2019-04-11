package com.leetcode.algorithm.hard.strmatch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(false, solution.isMatch("aa", "a"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true, solution.isMatch("aa", "aa"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(false, solution.isMatch("aaa", "aa"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(true, solution.isMatch("aa", "a{1,3}"));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertEquals(false, solution.isMatch("aaa", "a{1,3}"));
  }

  @Test
  public void testCase6() {
    Solution solution = new Solution();
    assertEquals(true, solution.isMatch("ab", "a{1,3}b{1,3}"));
  }

  @Test
  public void testCase7() {
    Solution solution = new Solution();
    assertEquals(true, solution.isMatch("abc", "a{1,3}b{1,3}c"));
  }

  @Test
  public void testCase8() {
    Solution solution = new Solution();
    assertEquals(false, solution.isMatch("abbc", "a{1,3}b{1,2}c"));
  }

  @Test
  public void testCase9() {
    Solution solution = new Solution();
    assertEquals(false, solution.isMatch("acbac", "a{1,3}b{1,3}c"));
  }

  @Test
  public void testCase10() {
    Solution solution = new Solution();
    assertEquals(true, solution.isMatch("abcc", "a{1,3}b{1,3}cc{1,3}"));
  }

  @Test
  public void testCase11() {
    Solution solution = new Solution();
    assertEquals(false, solution.isMatch("abbcc", "ab{3,5}cc{1,3}"));
  }

  @Test
  public void testCase12() {
    Solution solution = new Solution();
    assertEquals(true, solution.isMatch("abbbcc", "ab{3,5}cc{1,3}"));
  }
}
