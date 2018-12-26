package com.leetcode.algorithm.easy.iptocidr;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("255.0.0.7/32","255.0.0.8/29","255.0.0.16/32"),
        solution.ipToCIDR("255.0.0.7", 10));
  }
}
