package com.leetcode.algorithm.medium.simplifypath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("/home", solution.simplifyPath("/home/"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("/", solution.simplifyPath("/../"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("/home/foo", solution.simplifyPath("/home//foo/"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals("/c", solution.simplifyPath("/a/./b/../../c/"));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertEquals("/c", solution.simplifyPath("/a/../../b/../c//.//"));
  }

  @Test
  public void testCase6() {
    Solution solution = new Solution();
    assertEquals("/a/b/c", solution.simplifyPath("/a//b////c/d//././/.."));
  }
}
