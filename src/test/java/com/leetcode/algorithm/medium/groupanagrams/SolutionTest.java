package com.leetcode.algorithm.medium.groupanagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(Arrays.asList("eat","tea","ate"), Arrays.asList("bat"), Arrays.asList("tan","nat")),
        solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
  }
}
