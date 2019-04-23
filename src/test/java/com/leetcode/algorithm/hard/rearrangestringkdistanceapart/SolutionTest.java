package com.leetcode.algorithm.hard.rearrangestringkdistanceapart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("acbacb", solution.rearrangeString("aabbcc", 3));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("", solution.rearrangeString("aaabc", 3));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("abcabcad", solution.rearrangeString("aaadbbcc", 2));
  }
}
