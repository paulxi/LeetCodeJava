package com.leetcode.algorithm.easy.licensekeyformatting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("5F3Z-2E9W", solution.licenseKeyFormatting("5F3Z-2e-9-w", 4));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("2-5G-3J", solution.licenseKeyFormatting("2-5g-3-J", 2));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("5G-3J", solution.licenseKeyFormatting("-5g-3-J", 2));
  }
}
