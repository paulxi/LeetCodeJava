package com.leetcode.algorithm.medium.validateipaddress;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("IPv4", solution.validIPAddress("172.16.254.1"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("IPv6", solution.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("Neither", solution.validIPAddress("256.256.256.256"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals("Neither", solution.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
  }
}
