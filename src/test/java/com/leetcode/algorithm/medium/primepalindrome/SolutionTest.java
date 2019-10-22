package com.leetcode.algorithm.medium.primepalindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(7, solution.primePalindrome(6));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(11, solution.primePalindrome(8));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(101, solution.primePalindrome(13));
  }
}
