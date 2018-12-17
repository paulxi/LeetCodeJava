package com.leetcode.algorithm.medium.partitionlabels;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(9, 7, 8), solution.partitionLabels("ababcbacadefegdehijhklij"));
  }
}
