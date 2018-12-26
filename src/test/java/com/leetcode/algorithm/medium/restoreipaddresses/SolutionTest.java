package com.leetcode.algorithm.medium.restoreipaddresses;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("255.255.111.35", "255.255.11.135"),
        solution.restoreIpAddresses("25525511135"));
  }
}
