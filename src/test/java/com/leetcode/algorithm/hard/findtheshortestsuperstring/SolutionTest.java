package com.leetcode.algorithm.hard.findtheshortestsuperstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("leetcodelovesalex", solution.shortestSuperstring(new String[] {"alex","loves","leetcode"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("gctaagttcatgcatc", solution.shortestSuperstring(new String[] {"catg","ctaagt","gcta","ttca","atgcatc"}));
  }
}
